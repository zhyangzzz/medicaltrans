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

public final class AutonomousTaskPageListHelper
{
    public static void
    write(IceInternal.BasicStream __os, java.util.List<MtAutonomousTaskPageIce> __v)
    {
        if(__v == null)
        {
            __os.writeSize(0);
        }
        else
        {
            __os.writeSize(__v.size());
            for(MtAutonomousTaskPageIce __elem : __v)
            {
                __os.writeObject(__elem);
            }
        }
    }

    public static java.util.List<MtAutonomousTaskPageIce>
    read(IceInternal.BasicStream __is)
    {
        java.util.List<MtAutonomousTaskPageIce> __v;
        __v = new java.util.ArrayList();
        final int __len0 = __is.readAndCheckSeqSize(1);
        final String __type0 = MtAutonomousTaskPageIce.ice_staticId();
        for(int __i0 = 0; __i0 < __len0; __i0++)
        {
            __v.add(null);
            __is.readObject(new IceInternal.ListPatcher<MtAutonomousTaskPageIce>(__v, MtAutonomousTaskPageIce.class, __type0, __i0));
        }
        return __v;
    }
}
