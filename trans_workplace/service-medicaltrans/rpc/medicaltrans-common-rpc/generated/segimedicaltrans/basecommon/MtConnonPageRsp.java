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
// Generated from file `medicaltrans_base_common.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segimedicaltrans.basecommon;

public class MtConnonPageRsp extends Ice.ObjectImpl
{
    public MtConnonPageRsp()
    {
        taskId = "";
        organId = "";
        organName = "";
        fromHouseId = "";
        fromHouseName = "";
        toHouseId = "";
        toHouseName = "";
        transTypeParentCode = "";
        transTypeParentCodeName = "";
        transTypeId = "";
        transTypeName = "";
        transTools = "";
        transToolsName = "";
    }

    public MtConnonPageRsp(String taskId, String organId, String organName, String fromHouseId, String fromHouseName, String toHouseId, String toHouseName, String transTypeParentCode, String transTypeParentCodeName, String transTypeId, String transTypeName, String transTools, String transToolsName)
    {
        this.taskId = taskId;
        this.organId = organId;
        this.organName = organName;
        this.fromHouseId = fromHouseId;
        this.fromHouseName = fromHouseName;
        this.toHouseId = toHouseId;
        this.toHouseName = toHouseName;
        this.transTypeParentCode = transTypeParentCode;
        this.transTypeParentCodeName = transTypeParentCodeName;
        this.transTypeId = transTypeId;
        this.transTypeName = transTypeName;
        this.transTools = transTools;
        this.transToolsName = transToolsName;
    }

    private static class __F implements Ice.ObjectFactory
    {
        public Ice.Object create(String type)
        {
            assert(type.equals(ice_staticId()));
            return new MtConnonPageRsp();
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
        "::segimedicaltrans::basecommon::MtConnonPageRsp"
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
        __os.startWriteSlice(ice_staticId(), -1, true);
        __os.writeString(taskId);
        __os.writeString(organId);
        __os.writeString(organName);
        __os.writeString(fromHouseId);
        __os.writeString(fromHouseName);
        __os.writeString(toHouseId);
        __os.writeString(toHouseName);
        __os.writeString(transTypeParentCode);
        __os.writeString(transTypeParentCodeName);
        __os.writeString(transTypeId);
        __os.writeString(transTypeName);
        __os.writeString(transTools);
        __os.writeString(transToolsName);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        taskId = __is.readString();
        organId = __is.readString();
        organName = __is.readString();
        fromHouseId = __is.readString();
        fromHouseName = __is.readString();
        toHouseId = __is.readString();
        toHouseName = __is.readString();
        transTypeParentCode = __is.readString();
        transTypeParentCodeName = __is.readString();
        transTypeId = __is.readString();
        transTypeName = __is.readString();
        transTools = __is.readString();
        transToolsName = __is.readString();
        __is.endReadSlice();
    }

    public String taskId;

    public String
    getTaskId()
    {
        return taskId;
    }

    public void
    setTaskId(String _taskId)
    {
        taskId = _taskId;
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

    public String organName;

    public String
    getOrganName()
    {
        return organName;
    }

    public void
    setOrganName(String _organName)
    {
        organName = _organName;
    }

    public String fromHouseId;

    public String
    getFromHouseId()
    {
        return fromHouseId;
    }

    public void
    setFromHouseId(String _fromHouseId)
    {
        fromHouseId = _fromHouseId;
    }

    public String fromHouseName;

    public String
    getFromHouseName()
    {
        return fromHouseName;
    }

    public void
    setFromHouseName(String _fromHouseName)
    {
        fromHouseName = _fromHouseName;
    }

    public String toHouseId;

    public String
    getToHouseId()
    {
        return toHouseId;
    }

    public void
    setToHouseId(String _toHouseId)
    {
        toHouseId = _toHouseId;
    }

    public String toHouseName;

    public String
    getToHouseName()
    {
        return toHouseName;
    }

    public void
    setToHouseName(String _toHouseName)
    {
        toHouseName = _toHouseName;
    }

    public String transTypeParentCode;

    public String
    getTransTypeParentCode()
    {
        return transTypeParentCode;
    }

    public void
    setTransTypeParentCode(String _transTypeParentCode)
    {
        transTypeParentCode = _transTypeParentCode;
    }

    public String transTypeParentCodeName;

    public String
    getTransTypeParentCodeName()
    {
        return transTypeParentCodeName;
    }

    public void
    setTransTypeParentCodeName(String _transTypeParentCodeName)
    {
        transTypeParentCodeName = _transTypeParentCodeName;
    }

    public String transTypeId;

    public String
    getTransTypeId()
    {
        return transTypeId;
    }

    public void
    setTransTypeId(String _transTypeId)
    {
        transTypeId = _transTypeId;
    }

    public String transTypeName;

    public String
    getTransTypeName()
    {
        return transTypeName;
    }

    public void
    setTransTypeName(String _transTypeName)
    {
        transTypeName = _transTypeName;
    }

    public String transTools;

    public String
    getTransTools()
    {
        return transTools;
    }

    public void
    setTransTools(String _transTools)
    {
        transTools = _transTools;
    }

    public String transToolsName;

    public String
    getTransToolsName()
    {
        return transToolsName;
    }

    public void
    setTransToolsName(String _transToolsName)
    {
        transToolsName = _transToolsName;
    }

    public MtConnonPageRsp
    clone()
    {
        return (MtConnonPageRsp)super.clone();
    }

    public static final long serialVersionUID = 799499249L;
}