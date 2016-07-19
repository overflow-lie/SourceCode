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


package net.sirun.ngtp;

import com.oss.asn1.*;
import com.oss.coders.per.PerCoder;
import com.oss.metadata.*;

public class Ngtp extends ASN1Project {

    /**
     * Initialize the pdu decoder.
     */
    private static final ProjectInfo c_projectInfo = new ProjectInfo (
	null,
	new byte[] {
	    (byte)0x0b, (byte)0x63, (byte)0x55, (byte)0xd7, (byte)0x3f,
	    (byte)0xa7, (byte)0x19, (byte)0x0f, (byte)0x6c, (byte)0xa7,
	    (byte)0x71, (byte)0xd5, (byte)0x3f, (byte)0x07, (byte)0x03,
	    (byte)0x23, (byte)0xe9, (byte)0xcf, (byte)0x9b, (byte)0x58,
	    (byte)0x5d, (byte)0x48, (byte)0x8d, (byte)0x0f, (byte)0x30,
	    (byte)0x33, (byte)0x4f, (byte)0x3a, (byte)0x79, (byte)0x35,
	    (byte)0xd5, (byte)0x6c, (byte)0xb1, (byte)0x3c, (byte)0x43,
	    (byte)0xa4, (byte)0x77, (byte)0xed, (byte)0x79, (byte)0x52,
	    (byte)0x95, (byte)0x60, (byte)0x30, (byte)0x0f, (byte)0x8d,
	    (byte)0x48, (byte)0x55, (byte)0x9c, (byte)0x3e, (byte)0x17,
	    (byte)0x4c, (byte)0x6f, (byte)0xa6, (byte)0x54, (byte)0xa4,
	    (byte)0x73, (byte)0xcf, (byte)0xa4, (byte)0x78, (byte)0x2c,
	    (byte)0xca, (byte)0xf2
	},
	"2014/07/31"
    );
    
    /**
     * Get the project descriptor of 'this' object.
     */
    public ProjectInfo getProjectInfo()
    {
	return c_projectInfo;
    }
    
    private static final ASN1Project c_project = new Ngtp();

    /**
     * Methods for accessing Coders.
     */
    public static Coder getDefaultCoder()
    {
	return createPERUnalignedCoder(c_project);
    }
    
    public static PERAlignedCoder getPERAlignedCoder()
    {
	return createPERAlignedCoder(c_project);
    }
    
    public static PERUnalignedCoder getPERUnalignedCoder()
    {
	return createPERUnalignedCoder(c_project);
    }
    
}
