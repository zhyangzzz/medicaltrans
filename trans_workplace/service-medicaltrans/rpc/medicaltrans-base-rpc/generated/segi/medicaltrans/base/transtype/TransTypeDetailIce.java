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
// Generated from file `transtype.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.base.transtype;

public class TransTypeDetailIce extends TransTypeIce
{
    public TransTypeDetailIce()
    {
        super();
        remark = "";
        oprGuide = "";
    }

    public TransTypeDetailIce(String transTypeId, String groupOrganId, String organId, String organName, String transTypeParentCode, String transTypeParentCodeName, String transTypeCode, String transTypeName, String standardMinite, String warnMinite, String status, String statusName, String createDate, String createBy, String updateDate, String updateBy, String pageNo, String pageLength, String timeOut, String remark, String oprGuide)
    {
        super(transTypeId, groupOrganId, organId, organName, transTypeParentCode, transTypeParentCodeName, transTypeCode, transTypeName, standardMinite, warnMinite, status, statusName, createDate, createBy, updateDate, updateBy, pageNo, pageLength, timeOut);
        this.remark = remark;
        this.oprGuide = oprGuide;
    }

    private static class __F implements Ice.ObjectFactory
    {
        public Ice.Object create(String type)
        {
            assert(type.equals(ice_staticId()));
            return new TransTypeDetailIce();
        }

        public void destroy()
        {
        }
    }
    private static Ice.ObjectFactory _factory = new __F();

    public static Ice.ObjectFactory
    ice_factory()
    {
        return _factory;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::segi::medicaltrans::base::transtype::TransTypeDetailIce",
        "::segi::medicaltrans::base::transtype::TransTypeIce"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[1];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, false);
        __os.writeString(remark);
        __os.writeString(oprGuide);
        __os.endWriteSlice();
        super.__writeImpl(__os);
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        remark = __is.readString();
        oprGuide = __is.readString();
        __is.endReadSlice();
        super.__readImpl(__is);
    }

    public String remark;

    public String
    getRemark()
    {
        return remark;
    }

    public void
    setRemark(String _remark)
    {
        remark = _remark;
    }

    public String oprGuide;

    public String
    getOprGuide()
    {
        return oprGuide;
    }

    public void
    setOprGuide(String _oprGuide)
    {
        oprGuide = _oprGuide;
    }

    public TransTypeDetailIce
    clone()
    {
        return (TransTypeDetailIce)super.clone();
    }

    public static final long serialVersionUID = -173693451L;
}
