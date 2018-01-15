package com.circle.base.adapter;

import java.rmi.RemoteException;

/**
 * 远程用户服务
 */
public class RemoteUserClient {

    public String getUserById(Long userId) throws RemoteException{
        System.out.println("根据用户id查询用户");
        return null;
    }
}
