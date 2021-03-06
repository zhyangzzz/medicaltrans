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
// Generated from file `mt_task_manager.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.mttask.manager;

public class MtFixedTaskParam implements java.lang.Cloneable, java.io.Serializable
{
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

    public String transTypeParentCode;

    public String
    getTransTypeParentCode()
    {
        return transTypeParentCode;
    }

    public void
    setTransTypeParentCode(String _transTypeParentCode)
    {
        transTypeParentCode = _transTypeParentCode;
    }

    public String urgency;

    public String
    getUrgency()
    {
        return urgency;
    }

    public void
    setUrgency(String _urgency)
    {
        urgency = _urgency;
    }

    public String fromHouseId;

    public String
    getFromHouseId()
    {
        return fromHouseId;
    }

    public void
    setFromHouseId(String _fromHouseId)
    {
        fromHouseId = _fromHouseId;
    }

    public String toHouseId;

    public String
    getToHouseId()
    {
        return toHouseId;
    }

    public void
    setToHouseId(String _toHouseId)
    {
        toHouseId = _toHouseId;
    }

    public String transTools;

    public String
    getTransTools()
    {
        return transTools;
    }

    public void
    setTransTools(String _transTools)
    {
        transTools = _transTools;
    }

    public String taskContent;

    public String
    getTaskContent()
    {
        return taskContent;
    }

    public void
    setTaskContent(String _taskContent)
    {
        taskContent = _taskContent;
    }

    public String patientName;

    public String
    getPatientName()
    {
        return patientName;
    }

    public void
    setPatientName(String _patientName)
    {
        patientName = _patientName;
    }

    public String bedNo;

    public String
    getBedNo()
    {
        return bedNo;
    }

    public void
    setBedNo(String _bedNo)
    {
        bedNo = _bedNo;
    }

    public String patientGender;

    public String
    getPatientGender()
    {
        return patientGender;
    }

    public void
    setPatientGender(String _patientGender)
    {
        patientGender = _patientGender;
    }

    public String medicalRecNo;

    public String
    getMedicalRecNo()
    {
        return medicalRecNo;
    }

    public void
    setMedicalRecNo(String _medicalRecNo)
    {
        medicalRecNo = _medicalRecNo;
    }

    public String dataSource;

    public String
    getDataSource()
    {
        return dataSource;
    }

    public void
    setDataSource(String _dataSource)
    {
        dataSource = _dataSource;
    }

    public String beginTime;

    public String
    getBeginTime()
    {
        return beginTime;
    }

    public void
    setBeginTime(String _beginTime)
    {
        beginTime = _beginTime;
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

    public java.util.List<java.lang.Integer> transactors;

    public java.util.List<java.lang.Integer>
    getTransactors()
    {
        return transactors;
    }

    public void
    setTransactors(java.util.List<java.lang.Integer> _transactors)
    {
        transactors = _transactors;
    }

    public java.util.List<java.lang.Integer> routeList;

    public java.util.List<java.lang.Integer>
    getRouteList()
    {
        return routeList;
    }

    public void
    setRouteList(java.util.List<java.lang.Integer> _routeList)
    {
        routeList = _routeList;
    }

    public String createBy;

    public String
    getCreateBy()
    {
        return createBy;
    }

    public void
    setCreateBy(String _createBy)
    {
        createBy = _createBy;
    }

    public String taskLoopId;

    public String
    getTaskLoopId()
    {
        return taskLoopId;
    }

    public void
    setTaskLoopId(String _taskLoopId)
    {
        taskLoopId = _taskLoopId;
    }

    public MtFixedTaskParam()
    {
        organId = "";
        taskType = "";
        transTypeParentCode = "";
        urgency = "";
        fromHouseId = "";
        toHouseId = "";
        transTools = "";
        taskContent = "";
        patientName = "";
        bedNo = "";
        patientGender = "";
        medicalRecNo = "";
        dataSource = "";
        beginTime = "";
        limitMinute = "";
        createBy = "";
        taskLoopId = "";
    }

    public MtFixedTaskParam(String organId, String taskType, String transTypeParentCode, String urgency, String fromHouseId, String toHouseId, String transTools, String taskContent, String patientName, String bedNo, String patientGender, String medicalRecNo, String dataSource, String beginTime, String limitMinute, java.util.List<java.lang.Integer> transactors, java.util.List<java.lang.Integer> routeList, String createBy, String taskLoopId)
    {
        this.organId = organId;
        this.taskType = taskType;
        this.transTypeParentCode = transTypeParentCode;
        this.urgency = urgency;
        this.fromHouseId = fromHouseId;
        this.toHouseId = toHouseId;
        this.transTools = transTools;
        this.taskContent = taskContent;
        this.patientName = patientName;
        this.bedNo = bedNo;
        this.patientGender = patientGender;
        this.medicalRecNo = medicalRecNo;
        this.dataSource = dataSource;
        this.beginTime = beginTime;
        this.limitMinute = limitMinute;
        this.transactors = transactors;
        this.routeList = routeList;
        this.createBy = createBy;
        this.taskLoopId = taskLoopId;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        MtFixedTaskParam _r = null;
        if(rhs instanceof MtFixedTaskParam)
        {
            _r = (MtFixedTaskParam)rhs;
        }

        if(_r != null)
        {
            if(organId != _r.organId)
            {
                if(organId == null || _r.organId == null || !organId.equals(_r.organId))
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
            if(transTypeParentCode != _r.transTypeParentCode)
            {
                if(transTypeParentCode == null || _r.transTypeParentCode == null || !transTypeParentCode.equals(_r.transTypeParentCode))
                {
                    return false;
                }
            }
            if(urgency != _r.urgency)
            {
                if(urgency == null || _r.urgency == null || !urgency.equals(_r.urgency))
                {
                    return false;
                }
            }
            if(fromHouseId != _r.fromHouseId)
            {
                if(fromHouseId == null || _r.fromHouseId == null || !fromHouseId.equals(_r.fromHouseId))
                {
                    return false;
                }
            }
            if(toHouseId != _r.toHouseId)
            {
                if(toHouseId == null || _r.toHouseId == null || !toHouseId.equals(_r.toHouseId))
                {
                    return false;
                }
            }
            if(transTools != _r.transTools)
            {
                if(transTools == null || _r.transTools == null || !transTools.equals(_r.transTools))
                {
                    return false;
                }
            }
            if(taskContent != _r.taskContent)
            {
                if(taskContent == null || _r.taskContent == null || !taskContent.equals(_r.taskContent))
                {
                    return false;
                }
            }
            if(patientName != _r.patientName)
            {
                if(patientName == null || _r.patientName == null || !patientName.equals(_r.patientName))
                {
                    return false;
                }
            }
            if(bedNo != _r.bedNo)
            {
                if(bedNo == null || _r.bedNo == null || !bedNo.equals(_r.bedNo))
                {
                    return false;
                }
            }
            if(patientGender != _r.patientGender)
            {
                if(patientGender == null || _r.patientGender == null || !patientGender.equals(_r.patientGender))
                {
                    return false;
                }
            }
            if(medicalRecNo != _r.medicalRecNo)
            {
                if(medicalRecNo == null || _r.medicalRecNo == null || !medicalRecNo.equals(_r.medicalRecNo))
                {
                    return false;
                }
            }
            if(dataSource != _r.dataSource)
            {
                if(dataSource == null || _r.dataSource == null || !dataSource.equals(_r.dataSource))
                {
                    return false;
                }
            }
            if(beginTime != _r.beginTime)
            {
                if(beginTime == null || _r.beginTime == null || !beginTime.equals(_r.beginTime))
                {
                    return false;
                }
            }
            if(limitMinute != _r.limitMinute)
            {
                if(limitMinute == null || _r.limitMinute == null || !limitMinute.equals(_r.limitMinute))
                {
                    return false;
                }
            }
            if(transactors != _r.transactors)
            {
                if(transactors == null || _r.transactors == null || !transactors.equals(_r.transactors))
                {
                    return false;
                }
            }
            if(routeList != _r.routeList)
            {
                if(routeList == null || _r.routeList == null || !routeList.equals(_r.routeList))
                {
                    return false;
                }
            }
            if(createBy != _r.createBy)
            {
                if(createBy == null || _r.createBy == null || !createBy.equals(_r.createBy))
                {
                    return false;
                }
            }
            if(taskLoopId != _r.taskLoopId)
            {
                if(taskLoopId == null || _r.taskLoopId == null || !taskLoopId.equals(_r.taskLoopId))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::mttask::manager::MtFixedTaskParam");
        __h = IceInternal.HashUtil.hashAdd(__h, organId);
        __h = IceInternal.HashUtil.hashAdd(__h, taskType);
        __h = IceInternal.HashUtil.hashAdd(__h, transTypeParentCode);
        __h = IceInternal.HashUtil.hashAdd(__h, urgency);
        __h = IceInternal.HashUtil.hashAdd(__h, fromHouseId);
        __h = IceInternal.HashUtil.hashAdd(__h, toHouseId);
        __h = IceInternal.HashUtil.hashAdd(__h, transTools);
        __h = IceInternal.HashUtil.hashAdd(__h, taskContent);
        __h = IceInternal.HashUtil.hashAdd(__h, patientName);
        __h = IceInternal.HashUtil.hashAdd(__h, bedNo);
        __h = IceInternal.HashUtil.hashAdd(__h, patientGender);
        __h = IceInternal.HashUtil.hashAdd(__h, medicalRecNo);
        __h = IceInternal.HashUtil.hashAdd(__h, dataSource);
        __h = IceInternal.HashUtil.hashAdd(__h, beginTime);
        __h = IceInternal.HashUtil.hashAdd(__h, limitMinute);
        __h = IceInternal.HashUtil.hashAdd(__h, transactors);
        __h = IceInternal.HashUtil.hashAdd(__h, routeList);
        __h = IceInternal.HashUtil.hashAdd(__h, createBy);
        __h = IceInternal.HashUtil.hashAdd(__h, taskLoopId);
        return __h;
    }

    public MtFixedTaskParam
    clone()
    {
        MtFixedTaskParam c = null;
        try
        {
            c = (MtFixedTaskParam)super.clone();
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
        __os.writeString(organId);
        __os.writeString(taskType);
        __os.writeString(transTypeParentCode);
        __os.writeString(urgency);
        __os.writeString(fromHouseId);
        __os.writeString(toHouseId);
        __os.writeString(transTools);
        __os.writeString(taskContent);
        __os.writeString(patientName);
        __os.writeString(bedNo);
        __os.writeString(patientGender);
        __os.writeString(medicalRecNo);
        __os.writeString(dataSource);
        __os.writeString(beginTime);
        __os.writeString(limitMinute);
        segiwh.common.IntListHelper.write(__os, transactors);
        segiwh.common.IntListHelper.write(__os, routeList);
        __os.writeString(createBy);
        __os.writeString(taskLoopId);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        organId = __is.readString();
        taskType = __is.readString();
        transTypeParentCode = __is.readString();
        urgency = __is.readString();
        fromHouseId = __is.readString();
        toHouseId = __is.readString();
        transTools = __is.readString();
        taskContent = __is.readString();
        patientName = __is.readString();
        bedNo = __is.readString();
        patientGender = __is.readString();
        medicalRecNo = __is.readString();
        dataSource = __is.readString();
        beginTime = __is.readString();
        limitMinute = __is.readString();
        transactors = segiwh.common.IntListHelper.read(__is);
        routeList = segiwh.common.IntListHelper.read(__is);
        createBy = __is.readString();
        taskLoopId = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, MtFixedTaskParam __v)
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

    static public MtFixedTaskParam
    __read(IceInternal.BasicStream __is, MtFixedTaskParam __v)
    {
        if(__v == null)
        {
             __v = new MtFixedTaskParam();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final MtFixedTaskParam __nullMarshalValue = new MtFixedTaskParam();

    public static final long serialVersionUID = 662636226L;
}
