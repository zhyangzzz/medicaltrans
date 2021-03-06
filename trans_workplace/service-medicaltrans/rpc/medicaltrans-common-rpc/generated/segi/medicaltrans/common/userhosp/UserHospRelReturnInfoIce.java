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

public class UserHospRelReturnInfoIce implements java.lang.Cloneable, java.io.Serializable
{
    public String code;

    public String
    getCode()
    {
        return code;
    }

    public void
    setCode(String _code)
    {
        code = _code;
    }

    public String message;

    public String
    getMessage()
    {
        return message;
    }

    public void
    setMessage(String _message)
    {
        message = _message;
    }

    public UserHospCommonIce userHospCommonIce;

    public UserHospCommonIce
    getUserHospCommonIce()
    {
        return userHospCommonIce;
    }

    public void
    setUserHospCommonIce(UserHospCommonIce _userHospCommonIce)
    {
        userHospCommonIce = _userHospCommonIce;
    }

    public UserHospRelReturnInfoIce()
    {
        code = "";
        message = "";
        userHospCommonIce = new UserHospCommonIce();
    }

    public UserHospRelReturnInfoIce(String code, String message, UserHospCommonIce userHospCommonIce)
    {
        this.code = code;
        this.message = message;
        this.userHospCommonIce = userHospCommonIce;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        UserHospRelReturnInfoIce _r = null;
        if(rhs instanceof UserHospRelReturnInfoIce)
        {
            _r = (UserHospRelReturnInfoIce)rhs;
        }

        if(_r != null)
        {
            if(code != _r.code)
            {
                if(code == null || _r.code == null || !code.equals(_r.code))
                {
                    return false;
                }
            }
            if(message != _r.message)
            {
                if(message == null || _r.message == null || !message.equals(_r.message))
                {
                    return false;
                }
            }
            if(userHospCommonIce != _r.userHospCommonIce)
            {
                if(userHospCommonIce == null || _r.userHospCommonIce == null || !userHospCommonIce.equals(_r.userHospCommonIce))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::common::userhosp::UserHospRelReturnInfoIce");
        __h = IceInternal.HashUtil.hashAdd(__h, code);
        __h = IceInternal.HashUtil.hashAdd(__h, message);
        __h = IceInternal.HashUtil.hashAdd(__h, userHospCommonIce);
        return __h;
    }

    public UserHospRelReturnInfoIce
    clone()
    {
        UserHospRelReturnInfoIce c = null;
        try
        {
            c = (UserHospRelReturnInfoIce)super.clone();
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
        __os.writeString(code);
        __os.writeString(message);
        UserHospCommonIce.__write(__os, userHospCommonIce);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        code = __is.readString();
        message = __is.readString();
        userHospCommonIce = UserHospCommonIce.__read(__is, userHospCommonIce);
    }

    static public void
    __write(IceInternal.BasicStream __os, UserHospRelReturnInfoIce __v)
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

    static public UserHospRelReturnInfoIce
    __read(IceInternal.BasicStream __is, UserHospRelReturnInfoIce __v)
    {
        if(__v == null)
        {
             __v = new UserHospRelReturnInfoIce();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final UserHospRelReturnInfoIce __nullMarshalValue = new UserHospRelReturnInfoIce();

    public static final long serialVersionUID = 1014921L;
}
