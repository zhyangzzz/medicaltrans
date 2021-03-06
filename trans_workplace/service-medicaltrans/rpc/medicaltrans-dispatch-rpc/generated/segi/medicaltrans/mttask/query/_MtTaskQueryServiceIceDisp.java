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

public abstract class _MtTaskQueryServiceIceDisp extends Ice.ObjectImpl implements MtTaskQueryServiceIce
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws java.lang.CloneNotSupportedException
    {
        throw new java.lang.CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::segi::medicaltrans::mttask::query::MtTaskQueryServiceIce"
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

    public final MtAutonomousTaskDetailIceRsp queryAutonomousTaskDetailApp(int organId, int taskId)
    {
        return queryAutonomousTaskDetailApp(organId, taskId, null);
    }

    public final MtAutonomousTaskPaginatorIceRsp queryAutonomousTaskPage(MtTaskPageIceParam mtTaskPageIceParam)
    {
        return queryAutonomousTaskPage(mtTaskPageIceParam, null);
    }

    public final MtDispatchTaskPaginatorIceRsp queryDispatchTaskPageByAssign(MtTaskPageIceParam mtTaskPageIceParam)
    {
        return queryDispatchTaskPageByAssign(mtTaskPageIceParam, null);
    }

    public final MtDispatchTaskPaginatorIceRsp queryDispatchTaskPageByRob(MtTaskPageIceParam mtTaskPageIceParam)
    {
        return queryDispatchTaskPageByRob(mtTaskPageIceParam, null);
    }

    public final TaskAndEvaluatePaginatorIceRsp queryEvaluatePageForPad(MtTaskPageIceParam mtTaskPageIceParam)
    {
        return queryEvaluatePageForPad(mtTaskPageIceParam, null);
    }

    public final MtFixedTaskDetailIceRsp queryFixedTaskDetailApp(int organId, int taskId)
    {
        return queryFixedTaskDetailApp(organId, taskId, null);
    }

    public final FixedTaskExeDetailReturnIce queryFixedTaskExeDetail(int routeId, int organId)
    {
        return queryFixedTaskExeDetail(routeId, organId, null);
    }

    public final FixedTaskExePaginatorIceRsp queryFixedTaskExeInfoPage(MtTaskPageIceParam mtTaskPageIceParam)
    {
        return queryFixedTaskExeInfoPage(mtTaskPageIceParam, null);
    }

    public final MtFixedTaskPaginatorIceRsp queryFixedTaskPage(MtTaskPageIceParam mtTaskPageIceParam)
    {
        return queryFixedTaskPage(mtTaskPageIceParam, null);
    }

    public final MtDispatchTaskDetailIceRsp queryMtDispatchTaskDetailApp(int organId, int taskId, String userId)
    {
        return queryMtDispatchTaskDetailApp(organId, taskId, userId, null);
    }

    public final MtTaskDetailRetIceRsp queryMtTaskDetail(MtTaskDetailIceParam mtTaskDetailIceParam)
    {
        return queryMtTaskDetail(mtTaskDetailIceParam, null);
    }

    public final MtTaskDetailRetIceRsp queryMtTaskFixedDetail(MtTaskDetailIceParam mtTaskDetailIceParam)
    {
        return queryMtTaskFixedDetail(mtTaskDetailIceParam, null);
    }

    public final MtTaskHistoryPaginatorIce queryMtTaskHistoryPage(MtTaskPageIceParam mtTaskPageIceParam)
    {
        return queryMtTaskHistoryPage(mtTaskPageIceParam, null);
    }

    public final MtTaskPaginatorIce queryMtTaskPage(MtTaskPageIceParam mtTaskPageIceParam)
    {
        return queryMtTaskPage(mtTaskPageIceParam, null);
    }

    public final TaskAndEvaluatePaginatorIceRsp queryMtTaskPageForPad(MtTaskPageIceParam mtTaskPageIceParam)
    {
        return queryMtTaskPageForPad(mtTaskPageIceParam, null);
    }

    public final TaskIsTimeOutIceParam queryTaskIsTimeOut(int organId, int taskId)
    {
        return queryTaskIsTimeOut(organId, taskId, null);
    }

    public static Ice.DispatchStatus ___queryMtTaskPage(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        MtTaskPageIceParam mtTaskPageIceParam = null;
        mtTaskPageIceParam = MtTaskPageIceParam.__read(__is, mtTaskPageIceParam);
        __inS.endReadParams();
        MtTaskPaginatorIce __ret = __obj.queryMtTaskPage(mtTaskPageIceParam, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        MtTaskPaginatorIce.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryMtTaskHistoryPage(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        MtTaskPageIceParam mtTaskPageIceParam = null;
        mtTaskPageIceParam = MtTaskPageIceParam.__read(__is, mtTaskPageIceParam);
        __inS.endReadParams();
        MtTaskHistoryPaginatorIce __ret = __obj.queryMtTaskHistoryPage(mtTaskPageIceParam, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        MtTaskHistoryPaginatorIce.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryMtDispatchTaskDetailApp(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        int organId;
        int taskId;
        String userId;
        organId = __is.readInt();
        taskId = __is.readInt();
        userId = __is.readString();
        __inS.endReadParams();
        MtDispatchTaskDetailIceRsp __ret = __obj.queryMtDispatchTaskDetailApp(organId, taskId, userId, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        MtDispatchTaskDetailIceRsp.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryFixedTaskDetailApp(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        int organId;
        int taskId;
        organId = __is.readInt();
        taskId = __is.readInt();
        __inS.endReadParams();
        MtFixedTaskDetailIceRsp __ret = __obj.queryFixedTaskDetailApp(organId, taskId, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        MtFixedTaskDetailIceRsp.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryAutonomousTaskDetailApp(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        int organId;
        int taskId;
        organId = __is.readInt();
        taskId = __is.readInt();
        __inS.endReadParams();
        MtAutonomousTaskDetailIceRsp __ret = __obj.queryAutonomousTaskDetailApp(organId, taskId, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        MtAutonomousTaskDetailIceRsp.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryDispatchTaskPageByRob(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        MtTaskPageIceParam mtTaskPageIceParam = null;
        mtTaskPageIceParam = MtTaskPageIceParam.__read(__is, mtTaskPageIceParam);
        __inS.endReadParams();
        MtDispatchTaskPaginatorIceRsp __ret = __obj.queryDispatchTaskPageByRob(mtTaskPageIceParam, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        MtDispatchTaskPaginatorIceRsp.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryFixedTaskPage(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        MtTaskPageIceParam mtTaskPageIceParam = null;
        mtTaskPageIceParam = MtTaskPageIceParam.__read(__is, mtTaskPageIceParam);
        __inS.endReadParams();
        MtFixedTaskPaginatorIceRsp __ret = __obj.queryFixedTaskPage(mtTaskPageIceParam, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        MtFixedTaskPaginatorIceRsp.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryAutonomousTaskPage(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        MtTaskPageIceParam mtTaskPageIceParam = null;
        mtTaskPageIceParam = MtTaskPageIceParam.__read(__is, mtTaskPageIceParam);
        __inS.endReadParams();
        MtAutonomousTaskPaginatorIceRsp __ret = __obj.queryAutonomousTaskPage(mtTaskPageIceParam, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        MtAutonomousTaskPaginatorIceRsp.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryMtTaskPageForPad(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        MtTaskPageIceParam mtTaskPageIceParam = null;
        mtTaskPageIceParam = MtTaskPageIceParam.__read(__is, mtTaskPageIceParam);
        __inS.endReadParams();
        TaskAndEvaluatePaginatorIceRsp __ret = __obj.queryMtTaskPageForPad(mtTaskPageIceParam, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        TaskAndEvaluatePaginatorIceRsp.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryEvaluatePageForPad(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        MtTaskPageIceParam mtTaskPageIceParam = null;
        mtTaskPageIceParam = MtTaskPageIceParam.__read(__is, mtTaskPageIceParam);
        __inS.endReadParams();
        TaskAndEvaluatePaginatorIceRsp __ret = __obj.queryEvaluatePageForPad(mtTaskPageIceParam, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        TaskAndEvaluatePaginatorIceRsp.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryFixedTaskExeInfoPage(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        MtTaskPageIceParam mtTaskPageIceParam = null;
        mtTaskPageIceParam = MtTaskPageIceParam.__read(__is, mtTaskPageIceParam);
        __inS.endReadParams();
        FixedTaskExePaginatorIceRsp __ret = __obj.queryFixedTaskExeInfoPage(mtTaskPageIceParam, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        FixedTaskExePaginatorIceRsp.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryMtTaskDetail(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        MtTaskDetailIceParam mtTaskDetailIceParam = null;
        mtTaskDetailIceParam = MtTaskDetailIceParam.__read(__is, mtTaskDetailIceParam);
        __inS.endReadParams();
        MtTaskDetailRetIceRsp __ret = __obj.queryMtTaskDetail(mtTaskDetailIceParam, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        MtTaskDetailRetIceRsp.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryMtTaskFixedDetail(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        MtTaskDetailIceParam mtTaskDetailIceParam = null;
        mtTaskDetailIceParam = MtTaskDetailIceParam.__read(__is, mtTaskDetailIceParam);
        __inS.endReadParams();
        MtTaskDetailRetIceRsp __ret = __obj.queryMtTaskFixedDetail(mtTaskDetailIceParam, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        MtTaskDetailRetIceRsp.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryFixedTaskExeDetail(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        int routeId;
        int organId;
        routeId = __is.readInt();
        organId = __is.readInt();
        __inS.endReadParams();
        FixedTaskExeDetailReturnIce __ret = __obj.queryFixedTaskExeDetail(routeId, organId, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        FixedTaskExeDetailReturnIce.__write(__os, __ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryDispatchTaskPageByAssign(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        MtTaskPageIceParam mtTaskPageIceParam = null;
        mtTaskPageIceParam = MtTaskPageIceParam.__read(__is, mtTaskPageIceParam);
        __inS.endReadParams();
        MtDispatchTaskPaginatorIceRsp __ret = __obj.queryDispatchTaskPageByAssign(mtTaskPageIceParam, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        MtDispatchTaskPaginatorIceRsp.__write(__os, __ret);
        __os.writePendingObjects();
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___queryTaskIsTimeOut(MtTaskQueryServiceIce __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        int organId;
        int taskId;
        organId = __is.readInt();
        taskId = __is.readInt();
        __inS.endReadParams();
        TaskIsTimeOutIceParam __ret = __obj.queryTaskIsTimeOut(organId, taskId, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        TaskIsTimeOutIceParam.__write(__os, __ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "queryAutonomousTaskDetailApp",
        "queryAutonomousTaskPage",
        "queryDispatchTaskPageByAssign",
        "queryDispatchTaskPageByRob",
        "queryEvaluatePageForPad",
        "queryFixedTaskDetailApp",
        "queryFixedTaskExeDetail",
        "queryFixedTaskExeInfoPage",
        "queryFixedTaskPage",
        "queryMtDispatchTaskDetailApp",
        "queryMtTaskDetail",
        "queryMtTaskFixedDetail",
        "queryMtTaskHistoryPage",
        "queryMtTaskPage",
        "queryMtTaskPageForPad",
        "queryTaskIsTimeOut"
    };

    public Ice.DispatchStatus __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return ___ice_id(this, in, __current);
            }
            case 1:
            {
                return ___ice_ids(this, in, __current);
            }
            case 2:
            {
                return ___ice_isA(this, in, __current);
            }
            case 3:
            {
                return ___ice_ping(this, in, __current);
            }
            case 4:
            {
                return ___queryAutonomousTaskDetailApp(this, in, __current);
            }
            case 5:
            {
                return ___queryAutonomousTaskPage(this, in, __current);
            }
            case 6:
            {
                return ___queryDispatchTaskPageByAssign(this, in, __current);
            }
            case 7:
            {
                return ___queryDispatchTaskPageByRob(this, in, __current);
            }
            case 8:
            {
                return ___queryEvaluatePageForPad(this, in, __current);
            }
            case 9:
            {
                return ___queryFixedTaskDetailApp(this, in, __current);
            }
            case 10:
            {
                return ___queryFixedTaskExeDetail(this, in, __current);
            }
            case 11:
            {
                return ___queryFixedTaskExeInfoPage(this, in, __current);
            }
            case 12:
            {
                return ___queryFixedTaskPage(this, in, __current);
            }
            case 13:
            {
                return ___queryMtDispatchTaskDetailApp(this, in, __current);
            }
            case 14:
            {
                return ___queryMtTaskDetail(this, in, __current);
            }
            case 15:
            {
                return ___queryMtTaskFixedDetail(this, in, __current);
            }
            case 16:
            {
                return ___queryMtTaskHistoryPage(this, in, __current);
            }
            case 17:
            {
                return ___queryMtTaskPage(this, in, __current);
            }
            case 18:
            {
                return ___queryMtTaskPageForPad(this, in, __current);
            }
            case 19:
            {
                return ___queryTaskIsTimeOut(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, true);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        __is.endReadSlice();
    }

    public static final long serialVersionUID = 0L;
}
