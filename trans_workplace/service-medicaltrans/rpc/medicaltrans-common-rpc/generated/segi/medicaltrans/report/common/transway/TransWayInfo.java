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
// Generated from file `mt_transway_common.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.report.common.transway;

public class TransWayInfo implements java.lang.Cloneable, java.io.Serializable
{
    public String id;

    public String
    getId()
    {
        return id;
    }

    public void
    setId(String _id)
    {
        id = _id;
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

    public String walkTypeAmount;

    public String
    getWalkTypeAmount()
    {
        return walkTypeAmount;
    }

    public void
    setWalkTypeAmount(String _walkTypeAmount)
    {
        walkTypeAmount = _walkTypeAmount;
    }

    public String pushingBedTypeAmount;

    public String
    getPushingBedTypeAmount()
    {
        return pushingBedTypeAmount;
    }

    public void
    setPushingBedTypeAmount(String _pushingBedTypeAmount)
    {
        pushingBedTypeAmount = _pushingBedTypeAmount;
    }

    public String flatCartypeAmount;

    public String
    getFlatCartypeAmount()
    {
        return flatCartypeAmount;
    }

    public void
    setFlatCartypeAmount(String _flatCartypeAmount)
    {
        flatCartypeAmount = _flatCartypeAmount;
    }

    public String wheelchairTypeAmount;

    public String
    getWheelchairTypeAmount()
    {
        return wheelchairTypeAmount;
    }

    public void
    setWheelchairTypeAmount(String _wheelchairTypeAmount)
    {
        wheelchairTypeAmount = _wheelchairTypeAmount;
    }

    public TransWayInfo()
    {
        id = "";
        organId = "";
        walkTypeAmount = "";
        pushingBedTypeAmount = "";
        flatCartypeAmount = "";
        wheelchairTypeAmount = "";
    }

    public TransWayInfo(String id, String organId, String walkTypeAmount, String pushingBedTypeAmount, String flatCartypeAmount, String wheelchairTypeAmount)
    {
        this.id = id;
        this.organId = organId;
        this.walkTypeAmount = walkTypeAmount;
        this.pushingBedTypeAmount = pushingBedTypeAmount;
        this.flatCartypeAmount = flatCartypeAmount;
        this.wheelchairTypeAmount = wheelchairTypeAmount;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        TransWayInfo _r = null;
        if(rhs instanceof TransWayInfo)
        {
            _r = (TransWayInfo)rhs;
        }

        if(_r != null)
        {
            if(id != _r.id)
            {
                if(id == null || _r.id == null || !id.equals(_r.id))
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
            if(walkTypeAmount != _r.walkTypeAmount)
            {
                if(walkTypeAmount == null || _r.walkTypeAmount == null || !walkTypeAmount.equals(_r.walkTypeAmount))
                {
                    return false;
                }
            }
            if(pushingBedTypeAmount != _r.pushingBedTypeAmount)
            {
                if(pushingBedTypeAmount == null || _r.pushingBedTypeAmount == null || !pushingBedTypeAmount.equals(_r.pushingBedTypeAmount))
                {
                    return false;
                }
            }
            if(flatCartypeAmount != _r.flatCartypeAmount)
            {
                if(flatCartypeAmount == null || _r.flatCartypeAmount == null || !flatCartypeAmount.equals(_r.flatCartypeAmount))
                {
                    return false;
                }
            }
            if(wheelchairTypeAmount != _r.wheelchairTypeAmount)
            {
                if(wheelchairTypeAmount == null || _r.wheelchairTypeAmount == null || !wheelchairTypeAmount.equals(_r.wheelchairTypeAmount))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::report::common::transway::TransWayInfo");
        __h = IceInternal.HashUtil.hashAdd(__h, id);
        __h = IceInternal.HashUtil.hashAdd(__h, organId);
        __h = IceInternal.HashUtil.hashAdd(__h, walkTypeAmount);
        __h = IceInternal.HashUtil.hashAdd(__h, pushingBedTypeAmount);
        __h = IceInternal.HashUtil.hashAdd(__h, flatCartypeAmount);
        __h = IceInternal.HashUtil.hashAdd(__h, wheelchairTypeAmount);
        return __h;
    }

    public TransWayInfo
    clone()
    {
        TransWayInfo c = null;
        try
        {
            c = (TransWayInfo)super.clone();
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
        __os.writeString(id);
        __os.writeString(organId);
        __os.writeString(walkTypeAmount);
        __os.writeString(pushingBedTypeAmount);
        __os.writeString(flatCartypeAmount);
        __os.writeString(wheelchairTypeAmount);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readString();
        organId = __is.readString();
        walkTypeAmount = __is.readString();
        pushingBedTypeAmount = __is.readString();
        flatCartypeAmount = __is.readString();
        wheelchairTypeAmount = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, TransWayInfo __v)
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

    static public TransWayInfo
    __read(IceInternal.BasicStream __is, TransWayInfo __v)
    {
        if(__v == null)
        {
             __v = new TransWayInfo();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final TransWayInfo __nullMarshalValue = new TransWayInfo();

    public static final long serialVersionUID = 1338122939L;
}