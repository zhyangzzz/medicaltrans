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
// Generated from file `mt_userhosp_common.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.common.userhosp;

public class UserHospIce implements java.lang.Cloneable, java.io.Serializable
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

    public java.util.List<java.lang.Integer> userIdList;

    public java.util.List<java.lang.Integer>
    getUserIdList()
    {
        return userIdList;
    }

    public void
    setUserIdList(java.util.List<java.lang.Integer> _userIdList)
    {
        userIdList = _userIdList;
    }

    public UserHospIce()
    {
        userId = "";
        organId = "";
    }

    public UserHospIce(String userId, String organId, java.util.List<java.lang.Integer> userIdList)
    {
        this.userId = userId;
        this.organId = organId;
        this.userIdList = userIdList;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        UserHospIce _r = null;
        if(rhs instanceof UserHospIce)
        {
            _r = (UserHospIce)rhs;
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
            if(userIdList != _r.userIdList)
            {
                if(userIdList == null || _r.userIdList == null || !userIdList.equals(_r.userIdList))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::common::userhosp::UserHospIce");
        __h = IceInternal.HashUtil.hashAdd(__h, userId);
        __h = IceInternal.HashUtil.hashAdd(__h, organId);
        __h = IceInternal.HashUtil.hashAdd(__h, userIdList);
        return __h;
    }

    public UserHospIce
    clone()
    {
        UserHospIce c = null;
        try
        {
            c = (UserHospIce)super.clone();
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
        UserIdIntListHelper.write(__os, userIdList);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        userId = __is.readString();
        organId = __is.readString();
        userIdList = UserIdIntListHelper.read(__is);
    }

    static public void
    __write(IceInternal.BasicStream __os, UserHospIce __v)
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

    static public UserHospIce
    __read(IceInternal.BasicStream __is, UserHospIce __v)
    {
        if(__v == null)
        {
             __v = new UserHospIce();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final UserHospIce __nullMarshalValue = new UserHospIce();

    public static final long serialVersionUID = 1482049821L;
}