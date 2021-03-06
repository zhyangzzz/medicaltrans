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
// Generated from file `dept_volume_month.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.report.deptvolumemonth;

public final class MtrDeptVolumeMonthServiceIceHolder extends Ice.ObjectHolderBase<MtrDeptVolumeMonthServiceIce>
{
    public
    MtrDeptVolumeMonthServiceIceHolder()
    {
    }

    public
    MtrDeptVolumeMonthServiceIceHolder(MtrDeptVolumeMonthServiceIce value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof MtrDeptVolumeMonthServiceIce)
        {
            value = (MtrDeptVolumeMonthServiceIce)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _MtrDeptVolumeMonthServiceIceDisp.ice_staticId();
    }
}
