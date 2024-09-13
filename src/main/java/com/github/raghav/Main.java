package com.github.raghav;

import org.apache.hadoop.hive.metastore.api.Table;
import org.apache.thrift.TException;

import javax.security.auth.login.LoginException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static com.github.raghav.Util.getServerUri;

public class Main {
    public static void main(String[] args) throws URISyntaxException, TException, LoginException, IOException, InterruptedException {
        URI local_uri = getServerUri("127.0.0.1", "9083");
        HMSClient client = new HMSClient(local_uri ,"/Users/raghav/Desktop/setup/hive/conf");
        Table tbl = client.getTable("raaggarw","x");
        System.out.println(tbl);
    }
}