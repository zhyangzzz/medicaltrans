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
// Generated from file `task_loop.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.base.taskloop;

public class UserInfo implements java.lang.Cloneable, java.io.Serializable
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

    public String msg;

    public String
    getMsg()
    {
        return msg;
    }

    public void
    setMsg(String _msg)
    {
        msg = _msg;
    }

    public java.util.List<segiwh.common.User> userList;

    public java.util.List<segiwh.common.User>
    getUserList()
    {
        return userList;
    }

    public void
    setUserList(java.util.List<segiwh.common.User> _userList)
    {
        userList = _userList;
    }

    public UserInfo()
    {
        code = "";
        msg = "";
    }

    public UserInfo(String code, String msg, java.util.List<segiwh.common.User> userList)
    {
        this.code = code;
        this.msg = msg;
        this.userList = userList;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        UserInfo _r = null;
        if(rhs instanceof UserInfo)
        {
            _r = (UserInfo)rhs;
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
            if(msg != _r.msg)
            {
                if(msg == null || _r.msg == null || !msg.equals(_r.msg))
                {
                    return false;
                }
            }
            if(userList != _r.userList)
            {
                if(userList == null || _r.userList == null || !userList.equals(_r.userList))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::base::taskloop::UserInfo");
        __h = IceInternal.HashUtil.hashAdd(__h, code);
        __h = IceInternal.HashUtil.hashAdd(__h, msg);
        __h = IceInternal.HashUtil.hashAdd(__h, userList);
        return __h;
    }

    public UserInfo
    clone()
    {
        UserInfo c = null;
        try
        {
            c = (UserInfo)super.clone();
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
        __os.writeString(msg);
        segiwh.common.UserListHelper.write(__os, userList);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        code = __is.readString();
        msg = __is.readString();
        userList = segiwh.common.UserListHelper.read(__is);
    }

    static public void
    __write(IceInternal.BasicStream __os, UserInfo __v)
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

    static public UserInfo
    __read(IceInternal.BasicStream __is, UserInfo __v)
    {
        if(__v == null)
        {
             __v = new UserInfo();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final UserInfo __nullMarshalValue = new UserInfo();

    public static final long serialVersionUID = -1729063847L;
}
