package sample.interfaces;

import com.amazonaws.services.ec2.model.*;

public interface IAwsClient {
    RunInstancesResult createInstance(RunInstancesRequest runInstancesRequest);

    StartInstancesResult startInstance(String instanceId);

    StopInstancesResult stopInstance(String instanceId);

    TerminateInstancesResult terminateInstance(String instanceId);
}
