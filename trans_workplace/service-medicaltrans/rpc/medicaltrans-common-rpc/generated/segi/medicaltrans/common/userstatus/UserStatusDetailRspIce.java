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
// Generated from file `mt_user_status.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.common.userstatus;

public class UserStatusDetailRspIce implements java.lang.Cloneable, java.io.Serializable
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

    public UserStatusDetailIce userStatusDetailIce;

    public UserStatusDetailIce
    getUserStatusDetailIce()
    {
        return userStatusDetailIce;
    }

    public void
    setUserStatusDetailIce(UserStatusDetailIce _userStatusDetailIce)
    {
        userStatusDetailIce = _userStatusDetailIce;
    }

    public UserStatusDetailRspIce()
    {
        code = "";
        message = "";
        userStatusDetailIce = new UserStatusDetailIce();
    }

    public UserStatusDetailRspIce(String code, String message, UserStatusDetailIce userStatusDetailIce)
    {
        this.code = code;
        this.message = message;
        this.userStatusDetailIce = userStatusDetailIce;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        UserStatusDetailRspIce _r = null;
        if(rhs instanceof UserStatusDetailRspIce)
        {
            _r = (UserStatusDetailRspIce)rhs;
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
            if(userStatusDetailIce != _r.userStatusDetailIce)
            {
                if(userStatusDetailIce == null || _r.userStatusDetailIce == null || !userStatusDetailIce.equals(_r.userStatusDetailIce))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::common::userstatus::UserStatusDetailRspIce");
        __h = IceInternal.HashUtil.hashAdd(__h, code);
        __h = IceInternal.HashUtil.hashAdd(__h, message);
        __h = IceInternal.HashUtil.hashAdd(__h, userStatusDetailIce);
        return __h;
    }

    public UserStatusDetailRspIce
    clone()
    {
        UserStatusDetailRspIce c = null;
        try
        {
            c = (UserStatusDetailRspIce)super.clone();
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
        UserStatusDetailIce.__write(__os, userStatusDetailIce);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        code = __is.readString();
        message = __is.readString();
        userStatusDetailIce = UserStatusDetailIce.__read(__is, userStatusDetailIce);
    }

    static public void
    __write(IceInternal.BasicStream __os, UserStatusDetailRspIce __v)
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

    static public UserStatusDetailRspIce
    __read(IceInternal.BasicStream __is, UserStatusDetailRspIce __v)
    {
        if(__v == null)
        {
             __v = new UserStatusDetailRspIce();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final UserStatusDetailRspIce __nullMarshalValue = new UserStatusDetailRspIce();

    public static final long serialVersionUID = 180531386L;
}