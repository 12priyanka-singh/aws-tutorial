package sample.impl;

import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.*;
import sample.interfaces.IAwsClient;

public class AwsClient implements IAwsClient {
    public RunInstancesResult createInstance(RunInstancesRequest runInstancesRequest) {
        AmazonEC2Client amazonEC2Client = (AmazonEC2Client) AmazonEC2ClientBuilder.defaultClient();
        return amazonEC2Client.runInstances(runInstancesRequest);
    }

    public StartInstancesResult startInstance(String instanceId) {
        StartInstancesRequest request = new StartInstancesRequest().withInstanceIds(instanceId);
        AmazonEC2Client amazonEC2Client = (AmazonEC2Client) AmazonEC2ClientBuilder.defaultClient();
        return amazonEC2Client.startInstances(request);
    }

    public StopInstancesResult stopInstance(String instanceId) {
        StopInstancesRequest request = new StopInstancesRequest().withInstanceIds(instanceId);
        AmazonEC2Client amazonEC2Client = (AmazonEC2Client) AmazonEC2ClientBuilder.defaultClient();
        return amazonEC2Client.stopInstances(request);
    }

    public TerminateInstancesResult terminateInstance(String instanceId) {
        TerminateInstancesRequest request = new TerminateInstancesRequest().withInstanceIds(instanceId);
        AmazonEC2Client amazonEC2Client = (AmazonEC2Client) AmazonEC2ClientBuilder.defaultClient();
        return amazonEC2Client.terminateInstances(request);
    }
}
