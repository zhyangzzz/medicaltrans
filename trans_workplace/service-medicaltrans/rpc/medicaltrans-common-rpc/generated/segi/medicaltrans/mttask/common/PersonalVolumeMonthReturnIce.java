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

public class PersonalVolumeMonthReturnIce implements java.lang.Cloneable, java.io.Serializable
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

    public java.util.List<PersonalVolumeMonthIce> personalVolumeMonthList;

    public java.util.List<PersonalVolumeMonthIce>
    getPersonalVolumeMonthList()
    {
        return personalVolumeMonthList;
    }

    public void
    setPersonalVolumeMonthList(java.util.List<PersonalVolumeMonthIce> _personalVolumeMonthList)
    {
        personalVolumeMonthList = _personalVolumeMonthList;
    }

    public PersonalVolumeMonthReturnIce()
    {
        code = "";
        message = "";
    }

    public PersonalVolumeMonthReturnIce(String code, String message, java.util.List<PersonalVolumeMonthIce> personalVolumeMonthList)
    {
        this.code = code;
        this.message = message;
        this.personalVolumeMonthList = personalVolumeMonthList;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        PersonalVolumeMonthReturnIce _r = null;
        if(rhs instanceof PersonalVolumeMonthReturnIce)
        {
            _r = (PersonalVolumeMonthReturnIce)rhs;
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
            if(personalVolumeMonthList != _r.personalVolumeMonthList)
            {
                if(personalVolumeMonthList == null || _r.personalVolumeMonthList == null || !personalVolumeMonthList.equals(_r.personalVolumeMonthList))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::mttask::common::PersonalVolumeMonthReturnIce");
        __h = IceInternal.HashUtil.hashAdd(__h, code);
        __h = IceInternal.HashUtil.hashAdd(__h, message);
        __h = IceInternal.HashUtil.hashAdd(__h, personalVolumeMonthList);
        return __h;
    }

    public PersonalVolumeMonthReturnIce
    clone()
    {
        PersonalVolumeMonthReturnIce c = null;
        try
        {
            c = (PersonalVolumeMonthReturnIce)super.clone();
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
        PersonalVolumeMonthListHelper.write(__os, personalVolumeMonthList);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        code = __is.readString();
        message = __is.readString();
        personalVolumeMonthList = PersonalVolumeMonthListHelper.read(__is);
    }

    static public void
    __write(IceInternal.BasicStream __os, PersonalVolumeMonthReturnIce __v)
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

    static public PersonalVolumeMonthReturnIce
    __read(IceInternal.BasicStream __is, PersonalVolumeMonthReturnIce __v)
    {
        if(__v == null)
        {
             __v = new PersonalVolumeMonthReturnIce();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final PersonalVolumeMonthReturnIce __nullMarshalValue = new PersonalVolumeMonthReturnIce();

    public static final long serialVersionUID = -392834563L;
}
