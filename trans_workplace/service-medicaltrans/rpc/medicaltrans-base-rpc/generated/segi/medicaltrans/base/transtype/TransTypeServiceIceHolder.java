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

public final class TransTypeServiceIceHolder extends Ice.ObjectHolderBase<TransTypeServiceIce>
{
    public
    TransTypeServiceIceHolder()
    {
    }

    public
    TransTypeServiceIceHolder(TransTypeServiceIce value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof TransTypeServiceIce)
        {
            value = (TransTypeServiceIce)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _TransTypeServiceIceDisp.ice_staticId();
    }
}
