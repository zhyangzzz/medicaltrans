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
// Generated from file `mt_personal_volume_month.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.report.pervolume.month;

public class PersonalVolumeMonthPaginator implements java.lang.Cloneable, java.io.Serializable
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

    public page.RpcPageIce paginator;

    public page.RpcPageIce
    getPaginator()
    {
        return paginator;
    }

    public void
    setPaginator(page.RpcPageIce _paginator)
    {
        paginator = _paginator;
    }

    public java.util.List<PersonalVolumeMonthIce> resultList;

    public java.util.List<PersonalVolumeMonthIce>
    getResultList()
    {
        return resultList;
    }

    public void
    setResultList(java.util.List<PersonalVolumeMonthIce> _resultList)
    {
        resultList = _resultList;
    }

    public CurUserRankIce curUserRankIce;

    public CurUserRankIce
    getCurUserRankIce()
    {
        return curUserRankIce;
    }

    public void
    setCurUserRankIce(CurUserRankIce _curUserRankIce)
    {
        curUserRankIce = _curUserRankIce;
    }

    public PersonalVolumeMonthPaginator()
    {
        code = "";
        msg = "";
        curUserRankIce = new CurUserRankIce();
    }

    public PersonalVolumeMonthPaginator(String code, String msg, page.RpcPageIce paginator, java.util.List<PersonalVolumeMonthIce> resultList, CurUserRankIce curUserRankIce)
    {
        this.code = code;
        this.msg = msg;
        this.paginator = paginator;
        this.resultList = resultList;
        this.curUserRankIce = curUserRankIce;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        PersonalVolumeMonthPaginator _r = null;
        if(rhs instanceof PersonalVolumeMonthPaginator)
        {
            _r = (PersonalVolumeMonthPaginator)rhs;
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
            if(paginator != _r.paginator)
            {
                if(paginator == null || _r.paginator == null || !paginator.equals(_r.paginator))
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
            if(curUserRankIce != _r.curUserRankIce)
            {
                if(curUserRankIce == null || _r.curUserRankIce == null || !curUserRankIce.equals(_r.curUserRankIce))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::report::pervolume::month::PersonalVolumeMonthPaginator");
        __h = IceInternal.HashUtil.hashAdd(__h, code);
        __h = IceInternal.HashUtil.hashAdd(__h, msg);
        __h = IceInternal.HashUtil.hashAdd(__h, paginator);
        __h = IceInternal.HashUtil.hashAdd(__h, resultList);
        __h = IceInternal.HashUtil.hashAdd(__h, curUserRankIce);
        return __h;
    }

    public PersonalVolumeMonthPaginator
    clone()
    {
        PersonalVolumeMonthPaginator c = null;
        try
        {
            c = (PersonalVolumeMonthPaginator)super.clone();
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
        __os.writeObject(paginator);
        RankListHelper.write(__os, resultList);
        CurUserRankIce.__write(__os, curUserRankIce);
    }

    private class Patcher implements IceInternal.Patcher
    {
        public void
        patch(Ice.Object v)
        {
            if(v == null || v instanceof page.RpcPageIce)
            {
                paginator = (page.RpcPageIce)v;
            }
            else
            {
                IceInternal.Ex.throwUOE(type(), v);
            }
        }

        public String
        type()
        {
            return "::page::RpcPageIce";
        }
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        code = __is.readString();
        msg = __is.readString();
        __is.readObject(new Patcher());
        resultList = RankListHelper.read(__is);
        curUserRankIce = CurUserRankIce.__read(__is, curUserRankIce);
    }

    static public void
    __write(IceInternal.BasicStream __os, PersonalVolumeMonthPaginator __v)
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

    static public PersonalVolumeMonthPaginator
    __read(IceInternal.BasicStream __is, PersonalVolumeMonthPaginator __v)
    {
        if(__v == null)
        {
             __v = new PersonalVolumeMonthPaginator();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final PersonalVolumeMonthPaginator __nullMarshalValue = new PersonalVolumeMonthPaginator();

    public static final long serialVersionUID = -7908441L;
}