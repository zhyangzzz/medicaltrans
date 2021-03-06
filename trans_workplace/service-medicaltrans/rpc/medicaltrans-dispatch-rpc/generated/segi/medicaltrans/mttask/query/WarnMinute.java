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
// Generated from file `mt_task_query.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.mttask.query;

public class WarnMinute implements java.lang.Cloneable, java.io.Serializable
{
    public String noSendWarnMinute;

    public String
    getNoSendWarnMinute()
    {
        return noSendWarnMinute;
    }

    public void
    setNoSendWarnMinute(String _noSendWarnMinute)
    {
        noSendWarnMinute = _noSendWarnMinute;
    }

    public String noStartWarnMinute;

    public String
    getNoStartWarnMinute()
    {
        return noStartWarnMinute;
    }

    public void
    setNoStartWarnMinute(String _noStartWarnMinute)
    {
        noStartWarnMinute = _noStartWarnMinute;
    }

    public String noRobWarnMinute;

    public String
    getNoRobWarnMinute()
    {
        return noRobWarnMinute;
    }

    public void
    setNoRobWarnMinute(String _noRobWarnMinute)
    {
        noRobWarnMinute = _noRobWarnMinute;
    }

    public String systemTime;

    public String
    getSystemTime()
    {
        return systemTime;
    }

    public void
    setSystemTime(String _systemTime)
    {
        systemTime = _systemTime;
    }

    public WarnMinute()
    {
        noSendWarnMinute = "";
        noStartWarnMinute = "";
        noRobWarnMinute = "";
        systemTime = "";
    }

    public WarnMinute(String noSendWarnMinute, String noStartWarnMinute, String noRobWarnMinute, String systemTime)
    {
        this.noSendWarnMinute = noSendWarnMinute;
        this.noStartWarnMinute = noStartWarnMinute;
        this.noRobWarnMinute = noRobWarnMinute;
        this.systemTime = systemTime;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        WarnMinute _r = null;
        if(rhs instanceof WarnMinute)
        {
            _r = (WarnMinute)rhs;
        }

        if(_r != null)
        {
            if(noSendWarnMinute != _r.noSendWarnMinute)
            {
                if(noSendWarnMinute == null || _r.noSendWarnMinute == null || !noSendWarnMinute.equals(_r.noSendWarnMinute))
                {
                    return false;
                }
            }
            if(noStartWarnMinute != _r.noStartWarnMinute)
            {
                if(noStartWarnMinute == null || _r.noStartWarnMinute == null || !noStartWarnMinute.equals(_r.noStartWarnMinute))
                {
                    return false;
                }
            }
            if(noRobWarnMinute != _r.noRobWarnMinute)
            {
                if(noRobWarnMinute == null || _r.noRobWarnMinute == null || !noRobWarnMinute.equals(_r.noRobWarnMinute))
                {
                    return false;
                }
            }
            if(systemTime != _r.systemTime)
            {
                if(systemTime == null || _r.systemTime == null || !systemTime.equals(_r.systemTime))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::mttask::query::WarnMinute");
        __h = IceInternal.HashUtil.hashAdd(__h, noSendWarnMinute);
        __h = IceInternal.HashUtil.hashAdd(__h, noStartWarnMinute);
        __h = IceInternal.HashUtil.hashAdd(__h, noRobWarnMinute);
        __h = IceInternal.HashUtil.hashAdd(__h, systemTime);
        return __h;
    }

    public WarnMinute
    clone()
    {
        WarnMinute c = null;
        try
        {
            c = (WarnMinute)super.clone();
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
        __os.writeString(noSendWarnMinute);
        __os.writeString(noStartWarnMinute);
        __os.writeString(noRobWarnMinute);
        __os.writeString(systemTime);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        noSendWarnMinute = __is.readString();
        noStartWarnMinute = __is.readString();
        noRobWarnMinute = __is.readString();
        systemTime = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, WarnMinute __v)
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

    static public WarnMinute
    __read(IceInternal.BasicStream __is, WarnMinute __v)
    {
        if(__v == null)
        {
             __v = new WarnMinute();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final WarnMinute __nullMarshalValue = new WarnMinute();

    public static final long serialVersionUID = 635622606L;
}
