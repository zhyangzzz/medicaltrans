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
// Generated from file `mt_task_query.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.mttask.query;

public final class MtAutonomousTaskPageIceHolder extends Ice.ObjectHolderBase<MtAutonomousTaskPageIce>
{
    public
    MtAutonomousTaskPageIceHolder()
    {
    }

    public
    MtAutonomousTaskPageIceHolder(MtAutonomousTaskPageIce value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof MtAutonomousTaskPageIce)
        {
            value = (MtAutonomousTaskPageIce)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return MtAutonomousTaskPageIce.ice_staticId();
    }
}
