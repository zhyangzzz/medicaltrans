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
// Generated from file `ratio_common.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package segi.medicaltrans.report.ratio;

/**
 * Provides type-specific helper functions.
 **/
public final class RatioReportServiceIcePrxHelper extends Ice.ObjectPrxHelperBase implements RatioReportServiceIcePrx
{
    private static final String __queryTaskDateSourceRatio_name = "queryTaskDateSourceRatio";

    public TaskDateSourceReturnIce queryTaskDateSourceRatio(ReportCommonParam reportCommonParam)
    {
        return queryTaskDateSourceRatio(reportCommonParam, null, false);
    }

    public TaskDateSourceReturnIce queryTaskDateSourceRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx)
    {
        return queryTaskDateSourceRatio(reportCommonParam, __ctx, true);
    }

    private TaskDateSourceReturnIce queryTaskDateSourceRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__queryTaskDateSourceRatio_name);
        return end_queryTaskDateSourceRatio(begin_queryTaskDateSourceRatio(reportCommonParam, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_queryTaskDateSourceRatio(ReportCommonParam reportCommonParam)
    {
        return begin_queryTaskDateSourceRatio(reportCommonParam, null, false, false, null);
    }

    public Ice.AsyncResult begin_queryTaskDateSourceRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx)
    {
        return begin_queryTaskDateSourceRatio(reportCommonParam, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_queryTaskDateSourceRatio(ReportCommonParam reportCommonParam, Ice.Callback __cb)
    {
        return begin_queryTaskDateSourceRatio(reportCommonParam, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_queryTaskDateSourceRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_queryTaskDateSourceRatio(reportCommonParam, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_queryTaskDateSourceRatio(ReportCommonParam reportCommonParam, Callback_RatioReportServiceIce_queryTaskDateSourceRatio __cb)
    {
        return begin_queryTaskDateSourceRatio(reportCommonParam, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_queryTaskDateSourceRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx, Callback_RatioReportServiceIce_queryTaskDateSourceRatio __cb)
    {
        return begin_queryTaskDateSourceRatio(reportCommonParam, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_queryTaskDateSourceRatio(ReportCommonParam reportCommonParam, 
                                                          IceInternal.Functional_GenericCallback1<TaskDateSourceReturnIce> __responseCb, 
                                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_queryTaskDateSourceRatio(reportCommonParam, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_queryTaskDateSourceRatio(ReportCommonParam reportCommonParam, 
                                                          IceInternal.Functional_GenericCallback1<TaskDateSourceReturnIce> __responseCb, 
                                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryTaskDateSourceRatio(reportCommonParam, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_queryTaskDateSourceRatio(ReportCommonParam reportCommonParam, 
                                                          java.util.Map<String, String> __ctx, 
                                                          IceInternal.Functional_GenericCallback1<TaskDateSourceReturnIce> __responseCb, 
                                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_queryTaskDateSourceRatio(reportCommonParam, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_queryTaskDateSourceRatio(ReportCommonParam reportCommonParam, 
                                                          java.util.Map<String, String> __ctx, 
                                                          IceInternal.Functional_GenericCallback1<TaskDateSourceReturnIce> __responseCb, 
                                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryTaskDateSourceRatio(reportCommonParam, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_queryTaskDateSourceRatio(ReportCommonParam reportCommonParam, 
                                                           java.util.Map<String, String> __ctx, 
                                                           boolean __explicitCtx, 
                                                           boolean __synchronous, 
                                                           IceInternal.Functional_GenericCallback1<TaskDateSourceReturnIce> __responseCb, 
                                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                           IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryTaskDateSourceRatio(reportCommonParam, __ctx, __explicitCtx, __synchronous, 
                                              new IceInternal.Functional_TwowayCallbackArg1<segi.medicaltrans.report.ratio.TaskDateSourceReturnIce>(__responseCb, __exceptionCb, __sentCb)
                                                  {
                                                      public final void __completed(Ice.AsyncResult __result)
                                                      {
                                                          RatioReportServiceIcePrxHelper.__queryTaskDateSourceRatio_completed(this, __result);
                                                      }
                                                  });
    }

    private Ice.AsyncResult begin_queryTaskDateSourceRatio(ReportCommonParam reportCommonParam, 
                                                           java.util.Map<String, String> __ctx, 
                                                           boolean __explicitCtx, 
                                                           boolean __synchronous, 
                                                           IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__queryTaskDateSourceRatio_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__queryTaskDateSourceRatio_name, __cb);
        try
        {
            __result.prepare(__queryTaskDateSourceRatio_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            ReportCommonParam.__write(__os, reportCommonParam);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public TaskDateSourceReturnIce end_queryTaskDateSourceRatio(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __queryTaskDateSourceRatio_name);
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
            TaskDateSourceReturnIce __ret = null;
            __ret = TaskDateSourceReturnIce.__read(__is, __ret);
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

    static public void __queryTaskDateSourceRatio_completed(Ice.TwowayCallbackArg1<TaskDateSourceReturnIce> __cb, Ice.AsyncResult __result)
    {
        segi.medicaltrans.report.ratio.RatioReportServiceIcePrx __proxy = (segi.medicaltrans.report.ratio.RatioReportServiceIcePrx)__result.getProxy();
        TaskDateSourceReturnIce __ret = null;
        try
        {
            __ret = __proxy.end_queryTaskDateSourceRatio(__result);
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

    private static final String __queryTaskTypeRatio_name = "queryTaskTypeRatio";

    public TaskTypeReturnIce queryTaskTypeRatio(ReportCommonParam reportCommonParam)
    {
        return queryTaskTypeRatio(reportCommonParam, null, false);
    }

    public TaskTypeReturnIce queryTaskTypeRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx)
    {
        return queryTaskTypeRatio(reportCommonParam, __ctx, true);
    }

    private TaskTypeReturnIce queryTaskTypeRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__queryTaskTypeRatio_name);
        return end_queryTaskTypeRatio(begin_queryTaskTypeRatio(reportCommonParam, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_queryTaskTypeRatio(ReportCommonParam reportCommonParam)
    {
        return begin_queryTaskTypeRatio(reportCommonParam, null, false, false, null);
    }

    public Ice.AsyncResult begin_queryTaskTypeRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx)
    {
        return begin_queryTaskTypeRatio(reportCommonParam, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_queryTaskTypeRatio(ReportCommonParam reportCommonParam, Ice.Callback __cb)
    {
        return begin_queryTaskTypeRatio(reportCommonParam, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_queryTaskTypeRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_queryTaskTypeRatio(reportCommonParam, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_queryTaskTypeRatio(ReportCommonParam reportCommonParam, Callback_RatioReportServiceIce_queryTaskTypeRatio __cb)
    {
        return begin_queryTaskTypeRatio(reportCommonParam, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_queryTaskTypeRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx, Callback_RatioReportServiceIce_queryTaskTypeRatio __cb)
    {
        return begin_queryTaskTypeRatio(reportCommonParam, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_queryTaskTypeRatio(ReportCommonParam reportCommonParam, 
                                                    IceInternal.Functional_GenericCallback1<TaskTypeReturnIce> __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_queryTaskTypeRatio(reportCommonParam, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_queryTaskTypeRatio(ReportCommonParam reportCommonParam, 
                                                    IceInternal.Functional_GenericCallback1<TaskTypeReturnIce> __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                    IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryTaskTypeRatio(reportCommonParam, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_queryTaskTypeRatio(ReportCommonParam reportCommonParam, 
                                                    java.util.Map<String, String> __ctx, 
                                                    IceInternal.Functional_GenericCallback1<TaskTypeReturnIce> __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_queryTaskTypeRatio(reportCommonParam, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_queryTaskTypeRatio(ReportCommonParam reportCommonParam, 
                                                    java.util.Map<String, String> __ctx, 
                                                    IceInternal.Functional_GenericCallback1<TaskTypeReturnIce> __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                    IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryTaskTypeRatio(reportCommonParam, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_queryTaskTypeRatio(ReportCommonParam reportCommonParam, 
                                                     java.util.Map<String, String> __ctx, 
                                                     boolean __explicitCtx, 
                                                     boolean __synchronous, 
                                                     IceInternal.Functional_GenericCallback1<TaskTypeReturnIce> __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryTaskTypeRatio(reportCommonParam, __ctx, __explicitCtx, __synchronous, 
                                        new IceInternal.Functional_TwowayCallbackArg1<segi.medicaltrans.report.ratio.TaskTypeReturnIce>(__responseCb, __exceptionCb, __sentCb)
                                            {
                                                public final void __completed(Ice.AsyncResult __result)
                                                {
                                                    RatioReportServiceIcePrxHelper.__queryTaskTypeRatio_completed(this, __result);
                                                }
                                            });
    }

    private Ice.AsyncResult begin_queryTaskTypeRatio(ReportCommonParam reportCommonParam, 
                                                     java.util.Map<String, String> __ctx, 
                                                     boolean __explicitCtx, 
                                                     boolean __synchronous, 
                                                     IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__queryTaskTypeRatio_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__queryTaskTypeRatio_name, __cb);
        try
        {
            __result.prepare(__queryTaskTypeRatio_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            ReportCommonParam.__write(__os, reportCommonParam);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public TaskTypeReturnIce end_queryTaskTypeRatio(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __queryTaskTypeRatio_name);
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
            TaskTypeReturnIce __ret = null;
            __ret = TaskTypeReturnIce.__read(__is, __ret);
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

    static public void __queryTaskTypeRatio_completed(Ice.TwowayCallbackArg1<TaskTypeReturnIce> __cb, Ice.AsyncResult __result)
    {
        segi.medicaltrans.report.ratio.RatioReportServiceIcePrx __proxy = (segi.medicaltrans.report.ratio.RatioReportServiceIcePrx)__result.getProxy();
        TaskTypeReturnIce __ret = null;
        try
        {
            __ret = __proxy.end_queryTaskTypeRatio(__result);
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

    private static final String __queryTransTypeRatio_name = "queryTransTypeRatio";

    public TranstypeReturnIce queryTransTypeRatio(ReportCommonParam reportCommonParam)
    {
        return queryTransTypeRatio(reportCommonParam, null, false);
    }

    public TranstypeReturnIce queryTransTypeRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx)
    {
        return queryTransTypeRatio(reportCommonParam, __ctx, true);
    }

    private TranstypeReturnIce queryTransTypeRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__queryTransTypeRatio_name);
        return end_queryTransTypeRatio(begin_queryTransTypeRatio(reportCommonParam, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_queryTransTypeRatio(ReportCommonParam reportCommonParam)
    {
        return begin_queryTransTypeRatio(reportCommonParam, null, false, false, null);
    }

    public Ice.AsyncResult begin_queryTransTypeRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx)
    {
        return begin_queryTransTypeRatio(reportCommonParam, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_queryTransTypeRatio(ReportCommonParam reportCommonParam, Ice.Callback __cb)
    {
        return begin_queryTransTypeRatio(reportCommonParam, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_queryTransTypeRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_queryTransTypeRatio(reportCommonParam, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_queryTransTypeRatio(ReportCommonParam reportCommonParam, Callback_RatioReportServiceIce_queryTransTypeRatio __cb)
    {
        return begin_queryTransTypeRatio(reportCommonParam, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_queryTransTypeRatio(ReportCommonParam reportCommonParam, java.util.Map<String, String> __ctx, Callback_RatioReportServiceIce_queryTransTypeRatio __cb)
    {
        return begin_queryTransTypeRatio(reportCommonParam, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_queryTransTypeRatio(ReportCommonParam reportCommonParam, 
                                                     IceInternal.Functional_GenericCallback1<TranstypeReturnIce> __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_queryTransTypeRatio(reportCommonParam, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_queryTransTypeRatio(ReportCommonParam reportCommonParam, 
                                                     IceInternal.Functional_GenericCallback1<TranstypeReturnIce> __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryTransTypeRatio(reportCommonParam, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_queryTransTypeRatio(ReportCommonParam reportCommonParam, 
                                                     java.util.Map<String, String> __ctx, 
                                                     IceInternal.Functional_GenericCallback1<TranstypeReturnIce> __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_queryTransTypeRatio(reportCommonParam, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_queryTransTypeRatio(ReportCommonParam reportCommonParam, 
                                                     java.util.Map<String, String> __ctx, 
                                                     IceInternal.Functional_GenericCallback1<TranstypeReturnIce> __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryTransTypeRatio(reportCommonParam, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_queryTransTypeRatio(ReportCommonParam reportCommonParam, 
                                                      java.util.Map<String, String> __ctx, 
                                                      boolean __explicitCtx, 
                                                      boolean __synchronous, 
                                                      IceInternal.Functional_GenericCallback1<TranstypeReturnIce> __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                      IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryTransTypeRatio(reportCommonParam, __ctx, __explicitCtx, __synchronous, 
                                         new IceInternal.Functional_TwowayCallbackArg1<segi.medicaltrans.report.ratio.TranstypeReturnIce>(__responseCb, __exceptionCb, __sentCb)
                                             {
                                                 public final void __completed(Ice.AsyncResult __result)
                                                 {
                                                     RatioReportServiceIcePrxHelper.__queryTransTypeRatio_completed(this, __result);
                                                 }
                                             });
    }

    private Ice.AsyncResult begin_queryTransTypeRatio(ReportCommonParam reportCommonParam, 
                                                      java.util.Map<String, String> __ctx, 
                                                      boolean __explicitCtx, 
                                                      boolean __synchronous, 
                                                      IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__queryTransTypeRatio_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__queryTransTypeRatio_name, __cb);
        try
        {
            __result.prepare(__queryTransTypeRatio_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            ReportCommonParam.__write(__os, reportCommonParam);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public TranstypeReturnIce end_queryTransTypeRatio(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __queryTransTypeRatio_name);
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
            TranstypeReturnIce __ret = null;
            __ret = TranstypeReturnIce.__read(__is, __ret);
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

    static public void __queryTransTypeRatio_completed(Ice.TwowayCallbackArg1<TranstypeReturnIce> __cb, Ice.AsyncResult __result)
    {
        segi.medicaltrans.report.ratio.RatioReportServiceIcePrx __proxy = (segi.medicaltrans.report.ratio.RatioReportServiceIcePrx)__result.getProxy();
        TranstypeReturnIce __ret = null;
        try
        {
            __ret = __proxy.end_queryTransTypeRatio(__result);
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
    public static RatioReportServiceIcePrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), RatioReportServiceIcePrx.class, RatioReportServiceIcePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static RatioReportServiceIcePrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), RatioReportServiceIcePrx.class, RatioReportServiceIcePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static RatioReportServiceIcePrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), RatioReportServiceIcePrx.class, RatioReportServiceIcePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static RatioReportServiceIcePrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), RatioReportServiceIcePrx.class, RatioReportServiceIcePrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static RatioReportServiceIcePrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, RatioReportServiceIcePrx.class, RatioReportServiceIcePrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static RatioReportServiceIcePrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, RatioReportServiceIcePrx.class, RatioReportServiceIcePrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::segi::medicaltrans::report::ratio::RatioReportServiceIce"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, RatioReportServiceIcePrx v)
    {
        __os.writeProxy(v);
    }

    public static RatioReportServiceIcePrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            RatioReportServiceIcePrxHelper result = new RatioReportServiceIcePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}