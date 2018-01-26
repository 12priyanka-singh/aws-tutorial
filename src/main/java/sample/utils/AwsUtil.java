package sample.utils;

import com.amazonaws.services.ec2.model.InstanceType;
import com.amazonaws.services.ec2.model.RunInstancesRequest;

public class AwsUtil {
    public static RunInstancesRequest getRunInstancesRequest() {
        RunInstancesRequest runInstancesRequest = new RunInstancesRequest();
        runInstancesRequest.withImageId("ami-ffa6f090")
                .withInstanceType(InstanceType.T2Micro)
                .withMinCount(1)
                .withMaxCount(1)
                .withKeyName("sudheer")
                .withSecurityGroupIds("sg-c82f30a0");
        return runInstancesRequest;
    }
}
