package com.circle.base.adapter;

import java.rmi.RemoteException;

public class UserClientAdapter {

    private RemoteUserClient remoteUserClient;

    public UserClientAdapter(RemoteUserClient remoteUserClient) {
        this.remoteUserClient = remoteUserClient;
    }

    public String adapterGetUserById(Long userId){
        try {
            return remoteUserClient.getUserById(userId);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return null;
    }
}
