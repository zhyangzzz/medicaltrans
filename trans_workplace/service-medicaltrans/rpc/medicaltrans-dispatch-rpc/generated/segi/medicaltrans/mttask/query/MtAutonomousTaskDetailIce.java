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
// Generated from file `mt_task_query.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.mttask.query;

public class MtAutonomousTaskDetailIce extends segimedicaltrans.base.MtTaskBaseRsp
{
    public MtAutonomousTaskDetailIce()
    {
        super();
        limitMinute = "";
        finishContent = "";
        routeId = "";
        evaluate = "";
        evaluateContent = "";
        receiver = "";
        receiverUserName = "";
        receiverHouseName = "";
        receiveTime = "";
    }

    public MtAutonomousTaskDetailIce(String taskId, String organId, String organName, String transTypeParentCode, String transTypeParentCodeName, String transTypeId, String transTypeName, String fromHouseId, String fromHouseName, String toHouseId, String toHouseName, String patientName, String bedNo, String patientGender, String patientGenderName, String medicalRecNo, String transTools, String transToolsName, String taskContent, String beginTime, String endTime, String exeBeginTime, String exeEndTime, String status, String statusName, String fromHouseLocateType, String fromHouseMac, String toHouseLocateType, String toHouseMac, String exeEndUserId, String sourceHouseId, String sourceHouseName, String limitMinute, String finishContent, String routeId, String evaluate, String evaluateContent, String receiver, String receiverUserName, String receiverHouseName, String receiveTime)
    {
        super(taskId, organId, organName, transTypeParentCode, transTypeParentCodeName, transTypeId, transTypeName, fromHouseId, fromHouseName, toHouseId, toHouseName, patientName, bedNo, patientGender, patientGenderName, medicalRecNo, transTools, transToolsName, taskContent, beginTime, endTime, exeBeginTime, exeEndTime, status, statusName, fromHouseLocateType, fromHouseMac, toHouseLocateType, toHouseMac, exeEndUserId, sourceHouseId, sourceHouseName);
        this.limitMinute = limitMinute;
        this.finishContent = finishContent;
        this.routeId = routeId;
        this.evaluate = evaluate;
        this.evaluateContent = evaluateContent;
        this.receiver = receiver;
        this.receiverUserName = receiverUserName;
        this.receiverHouseName = receiverHouseName;
        this.receiveTime = receiveTime;
    }

    private static class __F implements Ice.ObjectFactory
    {
        public Ice.Object create(String type)
        {
            assert(type.equals(ice_staticId()));
            return new MtAutonomousTaskDetailIce();
        }

        public void destroy()
        {
        }
    }
    private static Ice.ObjectFactory _factory = new __F();

    public static Ice.ObjectFactory
    ice_factory()
    {
        return _factory;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::segi::medicaltrans::mttask::query::MtAutonomousTaskDetailIce",
        "::segimedicaltrans::base::MtTaskBaseRsp"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[1];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, false);
        __os.writeString(limitMinute);
        __os.writeString(finishContent);
        __os.writeString(routeId);
        __os.writeString(evaluate);
        __os.writeString(evaluateContent);
        __os.writeString(receiver);
        __os.writeString(receiverUserName);
        __os.writeString(receiverHouseName);
        __os.writeString(receiveTime);
        __os.endWriteSlice();
        super.__writeImpl(__os);
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        limitMinute = __is.readString();
        finishContent = __is.readString();
        routeId = __is.readString();
        evaluate = __is.readString();
        evaluateContent = __is.readString();
        receiver = __is.readString();
        receiverUserName = __is.readString();
        receiverHouseName = __is.readString();
        receiveTime = __is.readString();
        __is.endReadSlice();
        super.__readImpl(__is);
    }

    public String limitMinute;

    public String
    getLimitMinute()
    {
        return limitMinute;
    }

    public void
    setLimitMinute(String _limitMinute)
    {
        limitMinute = _limitMinute;
    }

    public String finishContent;

    public String
    getFinishContent()
    {
        return finishContent;
    }

    public void
    setFinishContent(String _finishContent)
    {
        finishContent = _finishContent;
    }

    public String routeId;

    public String
    getRouteId()
    {
        return routeId;
    }

    public void
    setRouteId(String _routeId)
    {
        routeId = _routeId;
    }

    public String evaluate;

    public String
    getEvaluate()
    {
        return evaluate;
    }

    public void
    setEvaluate(String _evaluate)
    {
        evaluate = _evaluate;
    }

    public String evaluateContent;

    public String
    getEvaluateContent()
    {
        return evaluateContent;
    }

    public void
    setEvaluateContent(String _evaluateContent)
    {
        evaluateContent = _evaluateContent;
    }

    public String receiver;

    public String
    getReceiver()
    {
        return receiver;
    }

    public void
    setReceiver(String _receiver)
    {
        receiver = _receiver;
    }

    public String receiverUserName;

    public String
    getReceiverUserName()
    {
        return receiverUserName;
    }

    public void
    setReceiverUserName(String _receiverUserName)
    {
        receiverUserName = _receiverUserName;
    }

    public String receiverHouseName;

    public String
    getReceiverHouseName()
    {
        return receiverHouseName;
    }

    public void
    setReceiverHouseName(String _receiverHouseName)
    {
        receiverHouseName = _receiverHouseName;
    }

    public String receiveTime;

    public String
    getReceiveTime()
    {
        return receiveTime;
    }

    public void
    setReceiveTime(String _receiveTime)
    {
        receiveTime = _receiveTime;
    }

    public MtAutonomousTaskDetailIce
    clone()
    {
        return (MtAutonomousTaskDetailIce)super.clone();
    }

    public static final long serialVersionUID = 1904792803L;
}