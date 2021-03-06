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
// Generated from file `mt_personal_volume_day.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.report.pervolume.day;

public class PerVolDayRsp implements java.lang.Cloneable, java.io.Serializable
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

    public java.util.List<PerVolDayIce> resultList;

    public java.util.List<PerVolDayIce>
    getResultList()
    {
        return resultList;
    }

    public void
    setResultList(java.util.List<PerVolDayIce> _resultList)
    {
        resultList = _resultList;
    }

    public PerVolDayRsp()
    {
        code = "";
        msg = "";
    }

    public PerVolDayRsp(String code, String msg, java.util.List<PerVolDayIce> resultList)
    {
        this.code = code;
        this.msg = msg;
        this.resultList = resultList;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        PerVolDayRsp _r = null;
        if(rhs instanceof PerVolDayRsp)
        {
            _r = (PerVolDayRsp)rhs;
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
            if(resultList != _r.resultList)
            {
                if(resultList == null || _r.resultList == null || !resultList.equals(_r.resultList))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::report::pervolume::day::PerVolDayRsp");
        __h = IceInternal.HashUtil.hashAdd(__h, code);
        __h = IceInternal.HashUtil.hashAdd(__h, msg);
        __h = IceInternal.HashUtil.hashAdd(__h, resultList);
        return __h;
    }

    public PerVolDayRsp
    clone()
    {
        PerVolDayRsp c = null;
        try
        {
            c = (PerVolDayRsp)super.clone();
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
        DayRankListHelper.write(__os, resultList);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        code = __is.readString();
        msg = __is.readString();
        resultList = DayRankListHelper.read(__is);
    }

    static public void
    __write(IceInternal.BasicStream __os, PerVolDayRsp __v)
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

    static public PerVolDayRsp
    __read(IceInternal.BasicStream __is, PerVolDayRsp __v)
    {
        if(__v == null)
        {
             __v = new PerVolDayRsp();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final PerVolDayRsp __nullMarshalValue = new PerVolDayRsp();

    public static final long serialVersionUID = 1727510200L;
}
