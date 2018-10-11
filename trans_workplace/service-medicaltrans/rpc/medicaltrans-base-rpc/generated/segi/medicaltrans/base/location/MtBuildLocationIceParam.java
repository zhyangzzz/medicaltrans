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
// Generated from file `mt_location_manager.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.base.location;

public class MtBuildLocationIceParam implements java.lang.Cloneable, java.io.Serializable
{
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

    public String sid;

    public String
    getSid()
    {
        return sid;
    }

    public void
    setSid(String _sid)
    {
        sid = _sid;
    }

    public String floorId;

    public String
    getFloorId()
    {
        return floorId;
    }

    public void
    setFloorId(String _floorId)
    {
        floorId = _floorId;
    }

    public String floorNum;

    public String
    getFloorNum()
    {
        return floorNum;
    }

    public void
    setFloorNum(String _floorNum)
    {
        floorNum = _floorNum;
    }

    public String locationName;

    public String
    getLocationName()
    {
        return locationName;
    }

    public void
    setLocationName(String _locationName)
    {
        locationName = _locationName;
    }

    public String locationId;

    public String
    getLocationId()
    {
        return locationId;
    }

    public void
    setLocationId(String _locationId)
    {
        locationId = _locationId;
    }

    public String houseSpaces;

    public String
    getHouseSpaces()
    {
        return houseSpaces;
    }

    public void
    setHouseSpaces(String _houseSpaces)
    {
        houseSpaces = _houseSpaces;
    }

    public String floorPositX;

    public String
    getFloorPositX()
    {
        return floorPositX;
    }

    public void
    setFloorPositX(String _floorPositX)
    {
        floorPositX = _floorPositX;
    }

    public String floorPositY;

    public String
    getFloorPositY()
    {
        return floorPositY;
    }

    public void
    setFloorPositY(String _floorPositY)
    {
        floorPositY = _floorPositY;
    }

    public String locateType;

    public String
    getLocateType()
    {
        return locateType;
    }

    public void
    setLocateType(String _locateType)
    {
        locateType = _locateType;
    }

    public String mac;

    public String
    getMac()
    {
        return mac;
    }

    public void
    setMac(String _mac)
    {
        mac = _mac;
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

    public String curUserId;

    public String
    getCurUserId()
    {
        return curUserId;
    }

    public void
    setCurUserId(String _curUserId)
    {
        curUserId = _curUserId;
    }

    public String pageNo;

    public String
    getPageNo()
    {
        return pageNo;
    }

    public void
    setPageNo(String _pageNo)
    {
        pageNo = _pageNo;
    }

    public String pageLength;

    public String
    getPageLength()
    {
        return pageLength;
    }

    public void
    setPageLength(String _pageLength)
    {
        pageLength = _pageLength;
    }

    public String defaultLocationId;

    public String
    getDefaultLocationId()
    {
        return defaultLocationId;
    }

    public void
    setDefaultLocationId(String _defaultLocationId)
    {
        defaultLocationId = _defaultLocationId;
    }

    public MtBuildLocationIceParam()
    {
        organId = "";
        buildId = "";
        sid = "";
        floorId = "";
        floorNum = "";
        locationName = "";
        locationId = "";
        houseSpaces = "";
        floorPositX = "";
        floorPositY = "";
        locateType = "";
        mac = "";
        remark = "";
        curUserId = "";
        pageNo = "";
        pageLength = "";
        defaultLocationId = "";
    }

    public MtBuildLocationIceParam(String organId, String buildId, String sid, String floorId, String floorNum, String locationName, String locationId, String houseSpaces, String floorPositX, String floorPositY, String locateType, String mac, String remark, String curUserId, String pageNo, String pageLength, String defaultLocationId)
    {
        this.organId = organId;
        this.buildId = buildId;
        this.sid = sid;
        this.floorId = floorId;
        this.floorNum = floorNum;
        this.locationName = locationName;
        this.locationId = locationId;
        this.houseSpaces = houseSpaces;
        this.floorPositX = floorPositX;
        this.floorPositY = floorPositY;
        this.locateType = locateType;
        this.mac = mac;
        this.remark = remark;
        this.curUserId = curUserId;
        this.pageNo = pageNo;
        this.pageLength = pageLength;
        this.defaultLocationId = defaultLocationId;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        MtBuildLocationIceParam _r = null;
        if(rhs instanceof MtBuildLocationIceParam)
        {
            _r = (MtBuildLocationIceParam)rhs;
        }

        if(_r != null)
        {
            if(organId != _r.organId)
            {
                if(organId == null || _r.organId == null || !organId.equals(_r.organId))
                {
                    return false;
                }
            }
            if(buildId != _r.buildId)
            {
                if(buildId == null || _r.buildId == null || !buildId.equals(_r.buildId))
                {
                    return false;
                }
            }
            if(sid != _r.sid)
            {
                if(sid == null || _r.sid == null || !sid.equals(_r.sid))
                {
                    return false;
                }
            }
            if(floorId != _r.floorId)
            {
                if(floorId == null || _r.floorId == null || !floorId.equals(_r.floorId))
                {
                    return false;
                }
            }
            if(floorNum != _r.floorNum)
            {
                if(floorNum == null || _r.floorNum == null || !floorNum.equals(_r.floorNum))
                {
                    return false;
                }
            }
            if(locationName != _r.locationName)
            {
                if(locationName == null || _r.locationName == null || !locationName.equals(_r.locationName))
                {
                    return false;
                }
            }
            if(locationId != _r.locationId)
            {
                if(locationId == null || _r.locationId == null || !locationId.equals(_r.locationId))
                {
                    return false;
                }
            }
            if(houseSpaces != _r.houseSpaces)
            {
                if(houseSpaces == null || _r.houseSpaces == null || !houseSpaces.equals(_r.houseSpaces))
                {
                    return false;
                }
            }
            if(floorPositX != _r.floorPositX)
            {
                if(floorPositX == null || _r.floorPositX == null || !floorPositX.equals(_r.floorPositX))
                {
                    return false;
                }
            }
            if(floorPositY != _r.floorPositY)
            {
                if(floorPositY == null || _r.floorPositY == null || !floorPositY.equals(_r.floorPositY))
                {
                    return false;
                }
            }
            if(locateType != _r.locateType)
            {
                if(locateType == null || _r.locateType == null || !locateType.equals(_r.locateType))
                {
                    return false;
                }
            }
            if(mac != _r.mac)
            {
                if(mac == null || _r.mac == null || !mac.equals(_r.mac))
                {
                    return false;
                }
            }
            if(remark != _r.remark)
            {
                if(remark == null || _r.remark == null || !remark.equals(_r.remark))
                {
                    return false;
                }
            }
            if(curUserId != _r.curUserId)
            {
                if(curUserId == null || _r.curUserId == null || !curUserId.equals(_r.curUserId))
                {
                    return false;
                }
            }
            if(pageNo != _r.pageNo)
            {
                if(pageNo == null || _r.pageNo == null || !pageNo.equals(_r.pageNo))
                {
                    return false;
                }
            }
            if(pageLength != _r.pageLength)
            {
                if(pageLength == null || _r.pageLength == null || !pageLength.equals(_r.pageLength))
                {
                    return false;
                }
            }
            if(defaultLocationId != _r.defaultLocationId)
            {
                if(defaultLocationId == null || _r.defaultLocationId == null || !defaultLocationId.equals(_r.defaultLocationId))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::segi::medicaltrans::base::location::MtBuildLocationIceParam");
        __h = IceInternal.HashUtil.hashAdd(__h, organId);
        __h = IceInternal.HashUtil.hashAdd(__h, buildId);
        __h = IceInternal.HashUtil.hashAdd(__h, sid);
        __h = IceInternal.HashUtil.hashAdd(__h, floorId);
        __h = IceInternal.HashUtil.hashAdd(__h, floorNum);
        __h = IceInternal.HashUtil.hashAdd(__h, locationName);
        __h = IceInternal.HashUtil.hashAdd(__h, locationId);
        __h = IceInternal.HashUtil.hashAdd(__h, houseSpaces);
        __h = IceInternal.HashUtil.hashAdd(__h, floorPositX);
        __h = IceInternal.HashUtil.hashAdd(__h, floorPositY);
        __h = IceInternal.HashUtil.hashAdd(__h, locateType);
        __h = IceInternal.HashUtil.hashAdd(__h, mac);
        __h = IceInternal.HashUtil.hashAdd(__h, remark);
        __h = IceInternal.HashUtil.hashAdd(__h, curUserId);
        __h = IceInternal.HashUtil.hashAdd(__h, pageNo);
        __h = IceInternal.HashUtil.hashAdd(__h, pageLength);
        __h = IceInternal.HashUtil.hashAdd(__h, defaultLocationId);
        return __h;
    }

    public MtBuildLocationIceParam
    clone()
    {
        MtBuildLocationIceParam c = null;
        try
        {
            c = (MtBuildLocationIceParam)super.clone();
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
        __os.writeString(organId);
        __os.writeString(buildId);
        __os.writeString(sid);
        __os.writeString(floorId);
        __os.writeString(floorNum);
        __os.writeString(locationName);
        __os.writeString(locationId);
        __os.writeString(houseSpaces);
        __os.writeString(floorPositX);
        __os.writeString(floorPositY);
        __os.writeString(locateType);
        __os.writeString(mac);
        __os.writeString(remark);
        __os.writeString(curUserId);
        __os.writeString(pageNo);
        __os.writeString(pageLength);
        __os.writeString(defaultLocationId);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        organId = __is.readString();
        buildId = __is.readString();
        sid = __is.readString();
        floorId = __is.readString();
        floorNum = __is.readString();
        locationName = __is.readString();
        locationId = __is.readString();
        houseSpaces = __is.readString();
        floorPositX = __is.readString();
        floorPositY = __is.readString();
        locateType = __is.readString();
        mac = __is.readString();
        remark = __is.readString();
        curUserId = __is.readString();
        pageNo = __is.readString();
        pageLength = __is.readString();
        defaultLocationId = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, MtBuildLocationIceParam __v)
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

    static public MtBuildLocationIceParam
    __read(IceInternal.BasicStream __is, MtBuildLocationIceParam __v)
    {
        if(__v == null)
        {
             __v = new MtBuildLocationIceParam();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final MtBuildLocationIceParam __nullMarshalValue = new MtBuildLocationIceParam();

    public static final long serialVersionUID = -1300924070L;
}