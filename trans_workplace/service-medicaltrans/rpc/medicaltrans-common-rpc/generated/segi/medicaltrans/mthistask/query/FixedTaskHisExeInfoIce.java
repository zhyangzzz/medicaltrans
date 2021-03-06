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

public class FixedTaskHisExeInfoIce implements java.lang.Cloneable, java.io.Serializable
{
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

    public String houseId;

    public String
    getHouseId()
    {
        return houseId;
    }

    public void
    setHouseId(String _houseId)
    {
        houseId = _houseId;
    }

    public String houseName;

    public String
    getHouseName()
    {
        return houseName;
    }

    public void
    setHouseName(String _houseName)
    {
        houseName = _houseName;
    }

    public String finishTime;

    public String
    getFinishTime()
    {
        return finishTime;
    }

    public void
    setFinishTime(String _finishTime)
    {
        finishTime = _finishTime;
    }

    public String status;

    public String
    getStatus()
    {
        return status;
    }

    public void
    setStatus(String _status)
    {
        status = _status;
    }

    public String isAutograph;

    public String
    getIsAutograph()
    {
        return isAutograph;
    }

    public void
    setIsAutograph(String _isAutograph)
    {
        isAutograph = _isAutograph;
    }

    public String locateType;

    public String
    getLocateType()
    {
        return locateType;
    }

    public void
    setLocateType(String _locateType)
    {
        locateType = _locateType;
    }

    public String mac;

    public String
    getMac()
    {
        return mac;
    }

    public void
    setMac(String _mac)
    {
        mac = _mac;
    }

    public FixedTaskHisExeInfoIce()
    {
        routeId = "";
        houseId = "";
        houseName = "";
        finishTime = "";
        status = "";
        isAutograph = "";
        locateType = "";
        mac = "";
    }

    public FixedTaskHisExeInfoIce(String routeId, String houseId, String houseName, String finishTime, String status, String isAutograph, String locateType, String mac)
    {
        this.routeId = routeId;
        this.houseId = houseId;
        this.houseName = houseName;
        this.finishTime = finishTime;
        this.status = status;
        this.isAutograph = isAutograph;
        this.locateType = locateType;
        this.mac = mac;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FixedTaskHisExeInfoIce _r = null;
        if(rhs instanceof FixedTaskHisExeInfoIce)
        {
            _r = (FixedTaskHisExeInfoIce)rhs;
        }

        if(_r != null)
        {
            if(routeId != _r.routeId)
            {
                if(routeId == null || _r.routeId == null || !routeId.equals(_r.routeId))
                {
                    return false;
                }
            }
            if(houseId != _r.houseId)
            {
                if(houseId == null || _r.houseId == null || !houseId.equals(_r.houseId))
                {
                    return false;
                }
            }
            if(houseName != _r.houseName)
            {
                if(houseName == null || _r.houseName == null || !houseName.equals(_r.houseName))
                {
                    return false;
                }
            }
            if(finishTime != _r.finishTime)
            {
                if(finishTime == null || _r.finishTime == null || !finishTime.equals(_r.finishTime))
                {
                    return false;
                }
            }
            if(status != _r.status)
            {
                if(status == null || _r.status == null || !status.equals(_r.status))
                {
                    return false;
                }
            }
            if(isAutograph != _r.isAutograph)
            {
                if(isAutograph == null || _r.isAutograph == null || !isAutograph.equals(_r.isAutograph))
                {
                    return false;
                }
            }
            if(locateType != _r.locateType)
            {
                if(locateType == null || _r.locateType == null || !locateType.equals(_r.locateType))
                {
                    return false;
                }
            }
            if(mac != _r.mac)
            {
                if(mac == null || _r.mac == null || !mac.equals(_r.mac))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::mthistask::query::FixedTaskHisExeInfoIce");
        __h = IceInternal.HashUtil.hashAdd(__h, routeId);
        __h = IceInternal.HashUtil.hashAdd(__h, houseId);
        __h = IceInternal.HashUtil.hashAdd(__h, houseName);
        __h = IceInternal.HashUtil.hashAdd(__h, finishTime);
        __h = IceInternal.HashUtil.hashAdd(__h, status);
        __h = IceInternal.HashUtil.hashAdd(__h, isAutograph);
        __h = IceInternal.HashUtil.hashAdd(__h, locateType);
        __h = IceInternal.HashUtil.hashAdd(__h, mac);
        return __h;
    }

    public FixedTaskHisExeInfoIce
    clone()
    {
        FixedTaskHisExeInfoIce c = null;
        try
        {
            c = (FixedTaskHisExeInfoIce)super.clone();
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
        __os.writeString(routeId);
        __os.writeString(houseId);
        __os.writeString(houseName);
        __os.writeString(finishTime);
        __os.writeString(status);
        __os.writeString(isAutograph);
        __os.writeString(locateType);
        __os.writeString(mac);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        routeId = __is.readString();
        houseId = __is.readString();
        houseName = __is.readString();
        finishTime = __is.readString();
        status = __is.readString();
        isAutograph = __is.readString();
        locateType = __is.readString();
        mac = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, FixedTaskHisExeInfoIce __v)
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

    static public FixedTaskHisExeInfoIce
    __read(IceInternal.BasicStream __is, FixedTaskHisExeInfoIce __v)
    {
        if(__v == null)
        {
             __v = new FixedTaskHisExeInfoIce();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final FixedTaskHisExeInfoIce __nullMarshalValue = new FixedTaskHisExeInfoIce();

    public static final long serialVersionUID = 767189580L;
}
