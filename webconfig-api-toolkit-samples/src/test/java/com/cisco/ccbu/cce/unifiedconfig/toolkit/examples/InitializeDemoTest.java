package com.cisco.ccbu.cce.unifiedconfig.toolkit.examples;

import com.cisco.ccbu.cce.unifiedconfig.toolkit.InitializationResult;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.InitializationStatus;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.StateEnum;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Some simple unit tests for FreshInstall class.
 */
public class InitializeDemoTest {
    @BeforeClass
    public static void beforeClass() {
        InitializeDemo.sleepTimeMs = 1;
    }

    /**
     * Test for ensuring we return the right value for successful task run.
     */
    @Test
    public void testMonitorInitializationSuccessful() throws InterruptedException {
        final List<List<InitializationStatus>> statusesList = new ArrayList<>();
        statusesList.add(Arrays.asList(constructStatus(StateEnum.NOT_STARTED, "task1"), constructStatus(StateEnum.NOT_STARTED, "task2")));
        statusesList.add(Arrays.asList(constructStatus(StateEnum.PROCESSING, "task1"), constructStatus(StateEnum.PROCESSING, "task2")));
        statusesList.add(Arrays.asList(constructStatus(StateEnum.SUCCEEDED, "task1"), constructStatus(StateEnum.PROCESSING, "task2")));
        statusesList.add(Arrays.asList(constructStatus(StateEnum.SUCCEEDED, "task1"), constructStatus(StateEnum.SUCCEEDED, "task2")));

        InitializeDemo initializeDemo = new InitializeDemo() {
            int pos = 0;
            @Override
            protected List<InitializationStatus> getStatusList() {
                assertTrue(pos<statusesList.size());
                return statusesList.get(pos++);
            }
        };
        InitializationResult result = initializeDemo.monitorInitialization();
        List<InitializationStatus> actualStatuses = result.getStatuses();
        assertTrue(result.isSuccessful());
        assertEquals(StateEnum.SUCCEEDED, actualStatuses.get(0).getState());
        assertEquals("task1", actualStatuses.get(0).getTaskName());
        assertEquals(StateEnum.SUCCEEDED, actualStatuses.get(1).getState());
        assertEquals("task2", actualStatuses.get(1).getTaskName());
    }

    /**
     * Test for ensuring we return the right value for failed task run.
     */
    @Test
    public void testMonitorInitializationWithFailedTask() throws InterruptedException {
        final List<List<InitializationStatus>> statusesList = new ArrayList<>();
        statusesList.add(Arrays.asList(constructStatus(StateEnum.PROCESSING, "task1"), constructStatus(StateEnum.PROCESSING, "task2")));
        statusesList.add(Arrays.asList(constructStatus(StateEnum.PROCESSING, "task1"), constructStatus(StateEnum.SUCCEEDED, "task2")));
        statusesList.add(Arrays.asList(constructStatus(StateEnum.FAILED, "task1"), constructStatus(StateEnum.SUCCEEDED, "task2")));

        InitializeDemo initializeDemo = new InitializeDemo() {
            int pos = 0;
            @Override
            protected List<InitializationStatus> getStatusList() {
                assertTrue(pos<statusesList.size());
                return statusesList.get(pos++);
            }
        };
        InitializationResult result = initializeDemo.monitorInitialization();
        List<InitializationStatus> actualStatuses = result.getStatuses();
        assertFalse(result.isSuccessful());
        assertEquals(StateEnum.FAILED, actualStatuses.get(0).getState());
        assertEquals("task1", actualStatuses.get(0).getTaskName());
        assertEquals(StateEnum.SUCCEEDED, actualStatuses.get(1).getState());
        assertEquals("task2", actualStatuses.get(1).getTaskName());
    }

    private InitializationStatus constructStatus(StateEnum state, String taskName) {
        InitializationStatus status = new InitializationStatus();
        status.setState(state);
        status.setTaskName(taskName);
        return status;
    }
}
