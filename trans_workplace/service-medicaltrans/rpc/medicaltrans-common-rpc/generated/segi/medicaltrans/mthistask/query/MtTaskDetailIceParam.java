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
// Generated from file `mt_his_task_query.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.mthistask.query;

public class MtTaskDetailIceParam implements java.lang.Cloneable, java.io.Serializable
{
    public String taskId;

    public String
    getTaskId()
    {
        return taskId;
    }

    public void
    setTaskId(String _taskId)
    {
        taskId = _taskId;
    }

    public String taskType;

    public String
    getTaskType()
    {
        return taskType;
    }

    public void
    setTaskType(String _taskType)
    {
        taskType = _taskType;
    }

    public String groupOrganId;

    public String
    getGroupOrganId()
    {
        return groupOrganId;
    }

    public void
    setGroupOrganId(String _groupOrganId)
    {
        groupOrganId = _groupOrganId;
    }

    public String organId;

    public String
    getOrganId()
    {
        return organId;
    }

    public void
    setOrganId(String _organId)
    {
        organId = _organId;
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

    public String cycleYm;

    public String
    getCycleYm()
    {
        return cycleYm;
    }

    public void
    setCycleYm(String _cycleYm)
    {
        cycleYm = _cycleYm;
    }

    public MtTaskDetailIceParam()
    {
        taskId = "";
        taskType = "";
        groupOrganId = "";
        organId = "";
        routeId = "";
        cycleYm = "";
    }

    public MtTaskDetailIceParam(String taskId, String taskType, String groupOrganId, String organId, String routeId, String cycleYm)
    {
        this.taskId = taskId;
        this.taskType = taskType;
        this.groupOrganId = groupOrganId;
        this.organId = organId;
        this.routeId = routeId;
        this.cycleYm = cycleYm;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        MtTaskDetailIceParam _r = null;
        if(rhs instanceof MtTaskDetailIceParam)
        {
            _r = (MtTaskDetailIceParam)rhs;
        }

        if(_r != null)
        {
            if(taskId != _r.taskId)
            {
                if(taskId == null || _r.taskId == null || !taskId.equals(_r.taskId))
                {
                    return false;
                }
            }
            if(taskType != _r.taskType)
            {
                if(taskType == null || _r.taskType == null || !taskType.equals(_r.taskType))
                {
                    return false;
                }
            }
            if(groupOrganId != _r.groupOrganId)
            {
                if(groupOrganId == null || _r.groupOrganId == null || !groupOrganId.equals(_r.groupOrganId))
                {
                    return false;
                }
            }
            if(organId != _r.organId)
            {
                if(organId == null || _r.organId == null || !organId.equals(_r.organId))
                {
                    return false;
                }
            }
            if(routeId != _r.routeId)
            {
                if(routeId == null || _r.routeId == null || !routeId.equals(_r.routeId))
                {
                    return false;
                }
            }
            if(cycleYm != _r.cycleYm)
            {
                if(cycleYm == null || _r.cycleYm == null || !cycleYm.equals(_r.cycleYm))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::mthistask::query::MtTaskDetailIceParam");
        __h = IceInternal.HashUtil.hashAdd(__h, taskId);
        __h = IceInternal.HashUtil.hashAdd(__h, taskType);
        __h = IceInternal.HashUtil.hashAdd(__h, groupOrganId);
        __h = IceInternal.HashUtil.hashAdd(__h, organId);
        __h = IceInternal.HashUtil.hashAdd(__h, routeId);
        __h = IceInternal.HashUtil.hashAdd(__h, cycleYm);
        return __h;
    }

    public MtTaskDetailIceParam
    clone()
    {
        MtTaskDetailIceParam c = null;
        try
        {
            c = (MtTaskDetailIceParam)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString(taskId);
        __os.writeString(taskType);
        __os.writeString(groupOrganId);
        __os.writeString(organId);
        __os.writeString(routeId);
        __os.writeString(cycleYm);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        taskId = __is.readString();
        taskType = __is.readString();
        groupOrganId = __is.readString();
        organId = __is.readString();
        routeId = __is.readString();
        cycleYm = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, MtTaskDetailIceParam __v)
    {
        if(__v == null)
        {
            __nullMarshalValue.__write(__os);
        }
        else
        {
            __v.__write(__os);
        }
    }

    static public MtTaskDetailIceParam
    __read(IceInternal.BasicStream __is, MtTaskDetailIceParam __v)
    {
        if(__v == null)
        {
             __v = new MtTaskDetailIceParam();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final MtTaskDetailIceParam __nullMarshalValue = new MtTaskDetailIceParam();

    public static final long serialVersionUID = 671040049L;
}
