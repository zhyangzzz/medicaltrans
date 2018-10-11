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
// Generated from file `spacemanage.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.base.spacemanage;

public interface _SpaceManageServiceIceOperationsNC
{
    BuildSimpleRetIce queryBuildByCommID(String communityId);

    BuildSimpleReturnIce getBuildSimpleInfo(String buildId);

    UnitSimpleReturnIce getUnitSimpleInfo(String unitId);

    FloorSimpleReturnIce getFloorInfoByFloorId(String floorId);

    PositionRetIce queryPositionListByParId(String communityId, String parId, String type);

    BuildDetailReturnIce getBuildDetail(String buildId);

    UnitDetailReturnIce getUnitDetail(String unitId);

    FloorDetailReturnIce getFloorDetail(String floorId);

    HouseInfoReturnIce getHouseAll(HouseInfoIce houseInfoIce);

    PositionRetIce queryPositionListByParIdInd(String communityId, String parId, String type);
}