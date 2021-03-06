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
// Generated from file `mt_task_common.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.mttask.common;

public class PersonalVolumeMonthIce implements java.lang.Cloneable, java.io.Serializable
{
    public String userId;

    public String
    getUserId()
    {
        return userId;
    }

    public void
    setUserId(String _userId)
    {
        userId = _userId;
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

    public String transVolume;

    public String
    getTransVolume()
    {
        return transVolume;
    }

    public void
    setTransVolume(String _transVolume)
    {
        transVolume = _transVolume;
    }

    public PersonalVolumeMonthIce()
    {
        userId = "";
        organId = "";
        transVolume = "";
    }

    public PersonalVolumeMonthIce(String userId, String organId, String transVolume)
    {
        this.userId = userId;
        this.organId = organId;
        this.transVolume = transVolume;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        PersonalVolumeMonthIce _r = null;
        if(rhs instanceof PersonalVolumeMonthIce)
        {
            _r = (PersonalVolumeMonthIce)rhs;
        }

        if(_r != null)
        {
            if(userId != _r.userId)
            {
                if(userId == null || _r.userId == null || !userId.equals(_r.userId))
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
            if(transVolume != _r.transVolume)
            {
                if(transVolume == null || _r.transVolume == null || !transVolume.equals(_r.transVolume))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::mttask::common::PersonalVolumeMonthIce");
        __h = IceInternal.HashUtil.hashAdd(__h, userId);
        __h = IceInternal.HashUtil.hashAdd(__h, organId);
        __h = IceInternal.HashUtil.hashAdd(__h, transVolume);
        return __h;
    }

    public PersonalVolumeMonthIce
    clone()
    {
        PersonalVolumeMonthIce c = null;
        try
        {
            c = (PersonalVolumeMonthIce)super.clone();
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
        __os.writeString(userId);
        __os.writeString(organId);
        __os.writeString(transVolume);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        userId = __is.readString();
        organId = __is.readString();
        transVolume = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, PersonalVolumeMonthIce __v)
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

    static public PersonalVolumeMonthIce
    __read(IceInternal.BasicStream __is, PersonalVolumeMonthIce __v)
    {
        if(__v == null)
        {
             __v = new PersonalVolumeMonthIce();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final PersonalVolumeMonthIce __nullMarshalValue = new PersonalVolumeMonthIce();

    public static final long serialVersionUID = -1016836923L;
}
