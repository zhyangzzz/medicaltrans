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
// Generated from file `mt_task_loop_common.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.common.taskloop;

public interface MtTaskLoopCommonServiceIcePrx extends Ice.ObjectPrx
{
    public resp.RpcRespIce updateTaskLoopStatus(TaskLoopStatusParam taskLoopStatusParam);

    public resp.RpcRespIce updateTaskLoopStatus(TaskLoopStatusParam taskLoopStatusParam, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_updateTaskLoopStatus(TaskLoopStatusParam taskLoopStatusParam);

    public Ice.AsyncResult begin_updateTaskLoopStatus(TaskLoopStatusParam taskLoopStatusParam, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_updateTaskLoopStatus(TaskLoopStatusParam taskLoopStatusParam, Ice.Callback __cb);

    public Ice.AsyncResult begin_updateTaskLoopStatus(TaskLoopStatusParam taskLoopStatusParam, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_updateTaskLoopStatus(TaskLoopStatusParam taskLoopStatusParam, Callback_MtTaskLoopCommonServiceIce_updateTaskLoopStatus __cb);

    public Ice.AsyncResult begin_updateTaskLoopStatus(TaskLoopStatusParam taskLoopStatusParam, java.util.Map<String, String> __ctx, Callback_MtTaskLoopCommonServiceIce_updateTaskLoopStatus __cb);

    public Ice.AsyncResult begin_updateTaskLoopStatus(TaskLoopStatusParam taskLoopStatusParam, 
                                                      IceInternal.Functional_GenericCallback1<resp.RpcRespIce> __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_updateTaskLoopStatus(TaskLoopStatusParam taskLoopStatusParam, 
                                                      IceInternal.Functional_GenericCallback1<resp.RpcRespIce> __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                      IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_updateTaskLoopStatus(TaskLoopStatusParam taskLoopStatusParam, 
                                                      java.util.Map<String, String> __ctx, 
                                                      IceInternal.Functional_GenericCallback1<resp.RpcRespIce> __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_updateTaskLoopStatus(TaskLoopStatusParam taskLoopStatusParam, 
                                                      java.util.Map<String, String> __ctx, 
                                                      IceInternal.Functional_GenericCallback1<resp.RpcRespIce> __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                      IceInternal.Functional_BoolCallback __sentCb);

    public resp.RpcRespIce end_updateTaskLoopStatus(Ice.AsyncResult __result);

    public MtTaskLoopIceListReturn getMtTaskLoopListByMonth(int organId);

    public MtTaskLoopIceListReturn getMtTaskLoopListByMonth(int organId, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getMtTaskLoopListByMonth(int organId);

    public Ice.AsyncResult begin_getMtTaskLoopListByMonth(int organId, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getMtTaskLoopListByMonth(int organId, Ice.Callback __cb);

    public Ice.AsyncResult begin_getMtTaskLoopListByMonth(int organId, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getMtTaskLoopListByMonth(int organId, Callback_MtTaskLoopCommonServiceIce_getMtTaskLoopListByMonth __cb);

    public Ice.AsyncResult begin_getMtTaskLoopListByMonth(int organId, java.util.Map<String, String> __ctx, Callback_MtTaskLoopCommonServiceIce_getMtTaskLoopListByMonth __cb);

    public Ice.AsyncResult begin_getMtTaskLoopListByMonth(int organId, 
                                                          IceInternal.Functional_GenericCallback1<MtTaskLoopIceListReturn> __responseCb, 
                                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getMtTaskLoopListByMonth(int organId, 
                                                          IceInternal.Functional_GenericCallback1<MtTaskLoopIceListReturn> __responseCb, 
                                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                          IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_getMtTaskLoopListByMonth(int organId, 
                                                          java.util.Map<String, String> __ctx, 
                                                          IceInternal.Functional_GenericCallback1<MtTaskLoopIceListReturn> __responseCb, 
                                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getMtTaskLoopListByMonth(int organId, 
                                                          java.util.Map<String, String> __ctx, 
                                                          IceInternal.Functional_GenericCallback1<MtTaskLoopIceListReturn> __responseCb, 
                                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                          IceInternal.Functional_BoolCallback __sentCb);

    public MtTaskLoopIceListReturn end_getMtTaskLoopListByMonth(Ice.AsyncResult __result);

    public MtTaskLoopIceListReturn getMtTaskLoopListByWeek(int organId);

    public MtTaskLoopIceListReturn getMtTaskLoopListByWeek(int organId, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getMtTaskLoopListByWeek(int organId);

    public Ice.AsyncResult begin_getMtTaskLoopListByWeek(int organId, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getMtTaskLoopListByWeek(int organId, Ice.Callback __cb);

    public Ice.AsyncResult begin_getMtTaskLoopListByWeek(int organId, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getMtTaskLoopListByWeek(int organId, Callback_MtTaskLoopCommonServiceIce_getMtTaskLoopListByWeek __cb);

    public Ice.AsyncResult begin_getMtTaskLoopListByWeek(int organId, java.util.Map<String, String> __ctx, Callback_MtTaskLoopCommonServiceIce_getMtTaskLoopListByWeek __cb);

    public Ice.AsyncResult begin_getMtTaskLoopListByWeek(int organId, 
                                                         IceInternal.Functional_GenericCallback1<MtTaskLoopIceListReturn> __responseCb, 
                                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getMtTaskLoopListByWeek(int organId, 
                                                         IceInternal.Functional_GenericCallback1<MtTaskLoopIceListReturn> __responseCb, 
                                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                         IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_getMtTaskLoopListByWeek(int organId, 
                                                         java.util.Map<String, String> __ctx, 
                                                         IceInternal.Functional_GenericCallback1<MtTaskLoopIceListReturn> __responseCb, 
                                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_getMtTaskLoopListByWeek(int organId, 
                                                         java.util.Map<String, String> __ctx, 
                                                         IceInternal.Functional_GenericCallback1<MtTaskLoopIceListReturn> __responseCb, 
                                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                         IceInternal.Functional_BoolCallback __sentCb);

    public MtTaskLoopIceListReturn end_getMtTaskLoopListByWeek(Ice.AsyncResult __result);

    public ReturnInteger selectLocationIdList(String taskLoopId);

    public ReturnInteger selectLocationIdList(String taskLoopId, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_selectLocationIdList(String taskLoopId);

    public Ice.AsyncResult begin_selectLocationIdList(String taskLoopId, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_selectLocationIdList(String taskLoopId, Ice.Callback __cb);

    public Ice.AsyncResult begin_selectLocationIdList(String taskLoopId, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_selectLocationIdList(String taskLoopId, Callback_MtTaskLoopCommonServiceIce_selectLocationIdList __cb);

    public Ice.AsyncResult begin_selectLocationIdList(String taskLoopId, java.util.Map<String, String> __ctx, Callback_MtTaskLoopCommonServiceIce_selectLocationIdList __cb);

    public Ice.AsyncResult begin_selectLocationIdList(String taskLoopId, 
                                                      IceInternal.Functional_GenericCallback1<ReturnInteger> __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_selectLocationIdList(String taskLoopId, 
                                                      IceInternal.Functional_GenericCallback1<ReturnInteger> __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                      IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_selectLocationIdList(String taskLoopId, 
                                                      java.util.Map<String, String> __ctx, 
                                                      IceInternal.Functional_GenericCallback1<ReturnInteger> __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_selectLocationIdList(String taskLoopId, 
                                                      java.util.Map<String, String> __ctx, 
                                                      IceInternal.Functional_GenericCallback1<ReturnInteger> __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                      IceInternal.Functional_BoolCallback __sentCb);

    public ReturnInteger end_selectLocationIdList(Ice.AsyncResult __result);

    public ReturnInteger selectUserIdList(String taskLoopId);

    public ReturnInteger selectUserIdList(String taskLoopId, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_selectUserIdList(String taskLoopId);

    public Ice.AsyncResult begin_selectUserIdList(String taskLoopId, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_selectUserIdList(String taskLoopId, Ice.Callback __cb);

    public Ice.AsyncResult begin_selectUserIdList(String taskLoopId, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_selectUserIdList(String taskLoopId, Callback_MtTaskLoopCommonServiceIce_selectUserIdList __cb);

    public Ice.AsyncResult begin_selectUserIdList(String taskLoopId, java.util.Map<String, String> __ctx, Callback_MtTaskLoopCommonServiceIce_selectUserIdList __cb);

    public Ice.AsyncResult begin_selectUserIdList(String taskLoopId, 
                                                  IceInternal.Functional_GenericCallback1<ReturnInteger> __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_selectUserIdList(String taskLoopId, 
                                                  IceInternal.Functional_GenericCallback1<ReturnInteger> __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                  IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_selectUserIdList(String taskLoopId, 
                                                  java.util.Map<String, String> __ctx, 
                                                  IceInternal.Functional_GenericCallback1<ReturnInteger> __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_selectUserIdList(String taskLoopId, 
                                                  java.util.Map<String, String> __ctx, 
                                                  IceInternal.Functional_GenericCallback1<ReturnInteger> __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                  IceInternal.Functional_BoolCallback __sentCb);

    public ReturnInteger end_selectUserIdList(Ice.AsyncResult __result);
}