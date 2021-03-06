/*************************************************************/
/* Copyright (C) 2014 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED. */

/* Generated for: sky (Trial) */
/* Abstract syntax: ngtp-service_3 */
/* ASN.1 Java project: net.sirun.ngtp.Ngtp */
/* Created: Fri Jun 27 14:42:53 2014 */
/* ASN.1 Compiler for Java version: 6.0 */
/* ASN.1 compiler options and file names specified:
 * -output net.sirun.ngtp -uper -root -messageFormat msvc
 * C:/Documents and Settings/Administrator/desktop/Service Data/ngtp-dspt_3.1.asn
 * C:/Documents and Settings/Administrator/desktop/Service Data/ngtp_servicetypes.asn
 * C:/Documents and Settings/Administrator/desktop/Service Data/ngtp-service_3.2.asn None */


package net.sirun.ngtp.ngtp_dispatch;

import com.oss.asn1.*;

public abstract class NGTP_Dispatch extends ASN1Module {

    
    
    // Value references
    public static final ProtocolVersionSingle4 protocolMajorVersion = 
	new ProtocolVersionSingle4(3);
    public static final ProtocolVersionSingle4 protocolMinorVersion = 
	new ProtocolVersionSingle4(1);
    public static final S32_SizeConstrainedInteger latitudeUnknown = 
	new S32_SizeConstrainedInteger(324000001);
    public static final S32_SizeConstrainedInteger longitudeUnknown = 
	new S32_SizeConstrainedInteger(648000001);
}
