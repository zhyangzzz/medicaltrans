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
// Generated from file `userinfomanage.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.base.userinfomanage;

/**
 * Provides type-specific helper functions.
 **/
public final class UserInfoManageServiceIcePrxHelper extends Ice.ObjectPrxHelperBase implements UserInfoManageServiceIcePrx
{
    private static final String __queryUserListByOrgIdAndOpts_name = "queryUserListByOrgIdAndOpts";

    public UserInfoIceRespIce queryUserListByOrgIdAndOpts(UserInfoParamsIce params)
    {
        return queryUserListByOrgIdAndOpts(params, null, false);
    }

    public UserInfoIceRespIce queryUserListByOrgIdAndOpts(UserInfoParamsIce params, java.util.Map<String, String> __ctx)
    {
        return queryUserListByOrgIdAndOpts(params, __ctx, true);
    }

    private UserInfoIceRespIce queryUserListByOrgIdAndOpts(UserInfoParamsIce params, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__queryUserListByOrgIdAndOpts_name);
        return end_queryUserListByOrgIdAndOpts(begin_queryUserListByOrgIdAndOpts(params, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_queryUserListByOrgIdAndOpts(UserInfoParamsIce params)
    {
        return begin_queryUserListByOrgIdAndOpts(params, null, false, false, null);
    }

    public Ice.AsyncResult begin_queryUserListByOrgIdAndOpts(UserInfoParamsIce params, java.util.Map<String, String> __ctx)
    {
        return begin_queryUserListByOrgIdAndOpts(params, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_queryUserListByOrgIdAndOpts(UserInfoParamsIce params, Ice.Callback __cb)
    {
        return begin_queryUserListByOrgIdAndOpts(params, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_queryUserListByOrgIdAndOpts(UserInfoParamsIce params, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_queryUserListByOrgIdAndOpts(params, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_queryUserListByOrgIdAndOpts(UserInfoParamsIce params, Callback_UserInfoManageServiceIce_queryUserListByOrgIdAndOpts __cb)
    {
        return begin_queryUserListByOrgIdAndOpts(params, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_queryUserListByOrgIdAndOpts(UserInfoParamsIce params, java.util.Map<String, String> __ctx, Callback_UserInfoManageServiceIce_queryUserListByOrgIdAndOpts __cb)
    {
        return begin_queryUserListByOrgIdAndOpts(params, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_queryUserListByOrgIdAndOpts(UserInfoParamsIce params, 
                                                             IceInternal.Functional_GenericCallback1<UserInfoIceRespIce> __responseCb, 
                                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_queryUserListByOrgIdAndOpts(params, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_queryUserListByOrgIdAndOpts(UserInfoParamsIce params, 
                                                             IceInternal.Functional_GenericCallback1<UserInfoIceRespIce> __responseCb, 
                                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryUserListByOrgIdAndOpts(params, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_queryUserListByOrgIdAndOpts(UserInfoParamsIce params, 
                                                             java.util.Map<String, String> __ctx, 
                                                             IceInternal.Functional_GenericCallback1<UserInfoIceRespIce> __responseCb, 
                                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_queryUserListByOrgIdAndOpts(params, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_queryUserListByOrgIdAndOpts(UserInfoParamsIce params, 
                                                             java.util.Map<String, String> __ctx, 
                                                             IceInternal.Functional_GenericCallback1<UserInfoIceRespIce> __responseCb, 
                                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryUserListByOrgIdAndOpts(params, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_queryUserListByOrgIdAndOpts(UserInfoParamsIce params, 
                                                              java.util.Map<String, String> __ctx, 
                                                              boolean __explicitCtx, 
                                                              boolean __synchronous, 
                                                              IceInternal.Functional_GenericCallback1<UserInfoIceRespIce> __responseCb, 
                                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                              IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryUserListByOrgIdAndOpts(params, __ctx, __explicitCtx, __synchronous, 
                                                 new IceInternal.Functional_TwowayCallbackArg1<segi.medicaltrans.base.userinfomanage.UserInfoIceRespIce>(__responseCb, __exceptionCb, __sentCb)
                                                     {
                                                         public final void __completed(Ice.AsyncResult __result)
                                                         {
                                                             UserInfoManageServiceIcePrxHelper.__queryUserListByOrgIdAndOpts_completed(this, __result);
                                                         }
                                                     });
    }

    private Ice.AsyncResult begin_queryUserListByOrgIdAndOpts(UserInfoParamsIce params, 
                                                              java.util.Map<String, String> __ctx, 
                                                              boolean __explicitCtx, 
                                                              boolean __synchronous, 
                                                              IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__queryUserListByOrgIdAndOpts_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__queryUserListByOrgIdAndOpts_name, __cb);
        try
        {
            __result.prepare(__queryUserListByOrgIdAndOpts_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            UserInfoParamsIce.__write(__os, params);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public UserInfoIceRespIce end_queryUserListByOrgIdAndOpts(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __queryUserListByOrgIdAndOpts_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            UserInfoIceRespIce __ret = null;
            __ret = UserInfoIceRespIce.__read(__is, __ret);
            __is.readPendingObjects();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __queryUserListByOrgIdAndOpts_completed(Ice.TwowayCallbackArg1<UserInfoIceRespIce> __cb, Ice.AsyncResult __result)
    {
        segi.medicaltrans.base.userinfomanage.UserInfoManageServiceIcePrx __proxy = (segi.medicaltrans.base.userinfomanage.UserInfoManageServiceIcePrx)__result.getProxy();
        UserInfoIceRespIce __ret = null;
        try
        {
            __ret = __proxy.end_queryUserListByOrgIdAndOpts(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static UserInfoManageServiceIcePrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), UserInfoManageServiceIcePrx.class, UserInfoManageServiceIcePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static UserInfoManageServiceIcePrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), UserInfoManageServiceIcePrx.class, UserInfoManageServiceIcePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static UserInfoManageServiceIcePrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), UserInfoManageServiceIcePrx.class, UserInfoManageServiceIcePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static UserInfoManageServiceIcePrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), UserInfoManageServiceIcePrx.class, UserInfoManageServiceIcePrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static UserInfoManageServiceIcePrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, UserInfoManageServiceIcePrx.class, UserInfoManageServiceIcePrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static UserInfoManageServiceIcePrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, UserInfoManageServiceIcePrx.class, UserInfoManageServiceIcePrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::segi::medicaltrans::base::userinfomanage::UserInfoManageServiceIce"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, UserInfoManageServiceIcePrx v)
    {
        __os.writeProxy(v);
    }

    public static UserInfoManageServiceIcePrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            UserInfoManageServiceIcePrxHelper result = new UserInfoManageServiceIcePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}