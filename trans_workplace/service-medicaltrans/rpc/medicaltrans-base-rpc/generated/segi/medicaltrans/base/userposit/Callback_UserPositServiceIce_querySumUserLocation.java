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

public abstract class Callback_UserPositServiceIce_querySumUserLocation
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1<segi.medicaltrans.base.userposit.SumUserLocationInfoIce>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        UserPositServiceIcePrxHelper.__querySumUserLocation_completed(this, __result);
    }
}