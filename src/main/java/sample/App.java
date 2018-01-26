package sample;

import com.amazonaws.services.ec2.model.*;
import sample.impl.AwsClient;
import sample.utils.AwsUtil;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AwsClient client = new AwsClient();
//        RunInstancesResult runInstancesResult = helper.createInstance(AwsUtil.getRunInstancesRequest());
//        System.out.println("Instance Created");
//
//        List<Instance> instances = runInstancesResult.getReservation().getInstances();
//        for(Instance instance : instances) {
//            System.out.println(instance.getInstanceId());
//        }
//
//        String instanceId = instances.get(0).getInstanceId();
//        System.out.println("InstanceId: " + instanceId);
//
//        StartInstancesResult startInstancesResult = helper.startInstance(instanceId);
//        System.out.println(startInstancesResult.getStartingInstances());
//        System.out.println( "Instance with id " + instanceId + " started");

//        StopInstancesResult stopInstancesResult = helper.stopInstance("i-0a4f72f9f402cc0e0");
//        System.out.println(stopInstancesResult.getStoppingInstances());
//        System.out.println( "Instance with id " + instanceId + " stopped");

        terminate(client, "i-03876d92d61f3cb53");
    }

    private static RunInstancesResult create(AwsClient client) {
        RunInstancesResult runInstancesResult = client.createInstance(AwsUtil.getRunInstancesRequest());
        System.out.println("Instance Created");
        return runInstancesResult;
    }

    private static StartInstancesResult start(AwsClient client, String instanceId) {
        StartInstancesResult startInstancesResult = client.startInstance(instanceId);
        System.out.println("Start instance request sent: " + startInstancesResult.getStartingInstances());
        return startInstancesResult;
    }

    private static StopInstancesResult stop(AwsClient client, String instanceId) {
        StopInstancesResult stopInstancesResult = client.stopInstance(instanceId);
        System.out.println("Stop instance request sent: " + stopInstancesResult.getStoppingInstances());
        return stopInstancesResult;
    }

    private static TerminateInstancesResult terminate(AwsClient client, String instanceId) {
        TerminateInstancesResult terminateInstancesResult = client.terminateInstance(instanceId);
        System.out.println("Terminate instance request sent: " + terminateInstancesResult.getTerminatingInstances());
        return terminateInstancesResult;
    }
}
