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
// Generated from file `mt_personal_volume_month.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.report.pervolume.month;

public final class PersonalVolumeMonthServiceIceHolder extends Ice.ObjectHolderBase<PersonalVolumeMonthServiceIce>
{
    public
    PersonalVolumeMonthServiceIceHolder()
    {
    }

    public
    PersonalVolumeMonthServiceIceHolder(PersonalVolumeMonthServiceIce value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof PersonalVolumeMonthServiceIce)
        {
            value = (PersonalVolumeMonthServiceIce)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _PersonalVolumeMonthServiceIceDisp.ice_staticId();
    }
}
