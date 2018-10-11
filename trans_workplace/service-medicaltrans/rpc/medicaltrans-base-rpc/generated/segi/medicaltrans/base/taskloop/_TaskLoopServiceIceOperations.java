// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.3
//
// <auto-generated>
//
// Generated from file `task_loop.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.base.taskloop;

public interface _TaskLoopServiceIceOperations
{
    TaskLoopPaginator queryTaskLoopByPage(TaskLoopPageParam taskLoopPageParam, Ice.Current __current);

    resp.RpcRespIce saveTaskLoop(TaskLoopParam taskLoopParam, Ice.Current __current);

    resp.RpcRespIce updateTaskLoop(TaskLoopParam taskLoopParam, Ice.Current __current);

    resp.RpcRespIce updateTaskLoopStatus(TaskLoopStatusParam taskLoopStatusParam, Ice.Current __current);

    TaskLoopInfo queryTaskLoopDetail(String taskLoopId, Ice.Current __current);

    HouseInfo queryHouseList(String taskLoopId, Ice.Current __current);

    UserInfo queryUserInfoList(String taskLoopId, Ice.Current __current);
}