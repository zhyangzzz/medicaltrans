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
// Generated from file `userposit.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.base.userposit;

public class BuildIce implements java.lang.Cloneable, java.io.Serializable
{
    public String buildId;

    public String
    getBuildId()
    {
        return buildId;
    }

    public void
    setBuildId(String _buildId)
    {
        buildId = _buildId;
    }

    public String buildName;

    public String
    getBuildName()
    {
        return buildName;
    }

    public void
    setBuildName(String _buildName)
    {
        buildName = _buildName;
    }

    public java.util.List<BuildFloorIce> buildFloorIceListList;

    public java.util.List<BuildFloorIce>
    getBuildFloorIceListList()
    {
        return buildFloorIceListList;
    }

    public void
    setBuildFloorIceListList(java.util.List<BuildFloorIce> _buildFloorIceListList)
    {
        buildFloorIceListList = _buildFloorIceListList;
    }

    public BuildIce()
    {
        buildId = "";
        buildName = "";
    }

    public BuildIce(String buildId, String buildName, java.util.List<BuildFloorIce> buildFloorIceListList)
    {
        this.buildId = buildId;
        this.buildName = buildName;
        this.buildFloorIceListList = buildFloorIceListList;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        BuildIce _r = null;
        if(rhs instanceof BuildIce)
        {
            _r = (BuildIce)rhs;
        }

        if(_r != null)
        {
            if(buildId != _r.buildId)
            {
                if(buildId == null || _r.buildId == null || !buildId.equals(_r.buildId))
                {
                    return false;
                }
            }
            if(buildName != _r.buildName)
            {
                if(buildName == null || _r.buildName == null || !buildName.equals(_r.buildName))
                {
                    return false;
                }
            }
            if(buildFloorIceListList != _r.buildFloorIceListList)
            {
                if(buildFloorIceListList == null || _r.buildFloorIceListList == null || !buildFloorIceListList.equals(_r.buildFloorIceListList))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::base::userposit::BuildIce");
        __h = IceInternal.HashUtil.hashAdd(__h, buildId);
        __h = IceInternal.HashUtil.hashAdd(__h, buildName);
        __h = IceInternal.HashUtil.hashAdd(__h, buildFloorIceListList);
        return __h;
    }

    public BuildIce
    clone()
    {
        BuildIce c = null;
        try
        {
            c = (BuildIce)super.clone();
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
        __os.writeString(buildId);
        __os.writeString(buildName);
        BuildFloorIceListHelper.write(__os, buildFloorIceListList);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        buildId = __is.readString();
        buildName = __is.readString();
        buildFloorIceListList = BuildFloorIceListHelper.read(__is);
    }

    static public void
    __write(IceInternal.BasicStream __os, BuildIce __v)
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

    static public BuildIce
    __read(IceInternal.BasicStream __is, BuildIce __v)
    {
        if(__v == null)
        {
             __v = new BuildIce();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final BuildIce __nullMarshalValue = new BuildIce();

    public static final long serialVersionUID = 1028502370L;
}