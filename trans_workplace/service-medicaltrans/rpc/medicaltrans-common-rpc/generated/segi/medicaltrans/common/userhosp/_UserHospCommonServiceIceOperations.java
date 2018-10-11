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
// Generated from file `mt_userhosp_common.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.common.userhosp;

public interface _UserHospCommonServiceIceOperations
{
    UserHospRelReturnInfoIce queryHospUserInfo(UserHospIce userHospIce, Ice.Current __current);

    UserHospRelIceListRsp queryHospUserInfoList(UserHospIce userHospIce, Ice.Current __current);

    UserIdsByHouseIdReturnIce queryUserIdsByHouseId(String houseId, Ice.Current __current);
}