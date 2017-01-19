package com.cisco.ccbu.cce.unifiedconfig.toolkit.examples;

import com.cisco.ccbu.cce.unifiedconfig.toolkit.RESTClient;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.bean.BucketInterval;

/**
 * Created by tweissin on 12/18/15.
 */
public class BucketIntervalDemo {
    public static void main(String[] args) {

        if(args.length < 3){
            System.out.println("BucketIntervalDemo requires 3 parameters: hostname username (with @domain) password");
            System.exit(0);
        }

        // Create a new RESTClient object with the IP of you DS / AW HDS
        RESTClient restClient = new RESTClient(args[0], args[1], args[2]);
        bucketIntervalDemo(restClient);
    }

    private static void bucketIntervalDemo(RESTClient restClient) {
        BucketInterval bean = new BucketInterval();
        bean.setName("abcde");
        bean.setUpperBound1(123);
        restClient.createAndGetBean(bean);
    }
}
