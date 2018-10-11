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

public interface _TransTypeServiceIceOperations
{
    resp.RpcRespIce saveTransType(TransTypeDetailIce transTypeDetailIce, Ice.Current __current);

    resp.RpcRespIce updateTransType(TransTypeDetailIce transTypeDetailIce, Ice.Current __current);

    resp.RpcRespIce updateStatusTransType(TransTypeIce transTypeIce, Ice.Current __current);

    TransTypeDetailReturnIce queryTransType(TransTypeIce transTypeIce, Ice.Current __current);

    TransTypeRetPageIce transTypePage(TransTypeIce transTypeIce, Ice.Current __current);

    TransTypeRetPageIce transTypeList(TransTypeIce transTypeIce, Ice.Current __current);

    TransTypeAllListIce transTypeAllList(TransTypeIce transTypeIce, Ice.Current __current);

    TransTypeOprGuideRetIce queryOprGuide(TransTypeIce transTypeIce, Ice.Current __current);
}