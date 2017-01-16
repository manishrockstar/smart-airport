package com.techm.bluemix.smarterairport.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.ProxyAuthenticationStrategy;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

import com.techm.bluemix.smarterairport.ServiceImpl.ContextAwareHttpComponentsClientHttpRequestFactory;


public class SAUtils {
	

	
	public static Map<String, String> flightCodeMap;
	public static Map<String, String> countryCodeMap;
	
	public static Map<String, Integer> daysMap;
	public static Map<String, String> latMap;
	public static Map<String, String> lonMap;
	public static Map<String, String> airlineCodeMap;
	public static InputStream input = null;
	public static Properties prop= new Properties();
	
	static{
	String filename="/lat.properties";
	input=SAProp.class.getClassLoader().getResourceAsStream(filename);
	try {
		prop.load(input);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
				
		countryCodeMap= new HashMap<String, String>();
		countryCodeMap.put("GA", "/30339%3A4%3AUS");
		countryCodeMap.put("LA", "/90011%3A4%3AUS");
		countryCodeMap.put("NY", "/11368%3A4%3AUS");
		
		daysMap= new HashMap<String, Integer>();
		daysMap.put("/3days", 4);
		daysMap.put("/5days", 6);
		daysMap.put("/7days", 8);
		daysMap.put("/10days", 11);
		
		airlineCodeMap= new HashMap<String, String>();
		airlineCodeMap.put("Adria Airways (JP)", "ADR");
		airlineCodeMap.put("Aegean Airlines (A3)", "AEE");
		airlineCodeMap.put("Aer Lingus (EI)", "EIN");
		airlineCodeMap.put("Aero Contractors (NG)", "NIG");
		airlineCodeMap.put("Aero República (P5)", "RBP");
		airlineCodeMap.put("Aeroflot (SU)", "AFL");
		airlineCodeMap.put("Aerolineas Argentinas (AR)", "ARG");
		airlineCodeMap.put("Aerolineas Galapagos S.A. Aerogal (2K)", "GLG");
		airlineCodeMap.put("Aeromexico (AM)", "AMX");
		airlineCodeMap.put("Afriqiyah Airways (8U)", "AAW");
		airlineCodeMap.put("Aigle Azur (ZI)", "AAF");
		airlineCodeMap.put("Air Algérie (AH)", "DAH");
		airlineCodeMap.put("Air Arabia (G9)", "ABY");
		airlineCodeMap.put("Air Astana (KC)", "KZR");
		airlineCodeMap.put("Air Austral (UU)", "REU");
		airlineCodeMap.put("Air Baltic (BT)", "BTI");
		airlineCodeMap.put("Air Berlin (AB)", "BER");
		airlineCodeMap.put("Air Botswana (BP)", "BOT");
		airlineCodeMap.put("Air Burkina (2J)", "VBW");
		airlineCodeMap.put("Air Cairo (SM)", "MSC");
		airlineCodeMap.put("Air Caledonie (TY)", "TPC");
		airlineCodeMap.put("Air Canada (AC)", "ACA");
		airlineCodeMap.put("Air Caraibes (TX)", "FWI");
		airlineCodeMap.put("Air China Limited (CA)", "CCA");
		airlineCodeMap.put("Air Corsica (XK)", "CCM");
		airlineCodeMap.put("Air Europa (UX)", "AEA");
		airlineCodeMap.put("Air France (AF)", "AFR");
		airlineCodeMap.put("Air India  (AI)", "AIC");
		airlineCodeMap.put("Air Koryo (JS)", "KOR");
		airlineCodeMap.put("Air Macau (NX)", "AMU");
		airlineCodeMap.put("Air Madagascar (MD)", "MDG");
		airlineCodeMap.put("Air Malta  (KM)", "AMC");
		airlineCodeMap.put("Air Mauritius (MK)", "MAU");
		airlineCodeMap.put("Air Moldova (9U)", "MLD");
		airlineCodeMap.put("Air Namibia (SW)", "NMB");
		airlineCodeMap.put("Air New Zealand (NZ)", "ANZ");
		airlineCodeMap.put("Air Niugini (PX)", "ANG");
		airlineCodeMap.put("Air Nostrum (YW)", "ANE");
		airlineCodeMap.put("Air SERBIA a.d. Beograd (JU)", "ASL");
		airlineCodeMap.put("Air Seychelles (HM)", "SEY");
		airlineCodeMap.put("Air Tahiti (VT)", "VTA");
		airlineCodeMap.put("Air Tahiti Nui (TN)", "THT");
		airlineCodeMap.put("Air Transat (TS)", "TSC");
		airlineCodeMap.put("AirBridgeCargo Airlines (RU)", "ABW");
		airlineCodeMap.put("Aircalin (SB)", "ACI");
		airlineCodeMap.put("Alaska Airlines (AS)", "ASA");
		airlineCodeMap.put("Alitalia (AZ)", "AZA");
		airlineCodeMap.put("All Nippon Airways (NH)", "ANA");
		airlineCodeMap.put("Allied Air (4W)", "AJK");
		airlineCodeMap.put("AlMasria Universal Airlines (UJ)", "LMU");
		airlineCodeMap.put("American Airlines (AA)", "AAL");
		airlineCodeMap.put("Arik Air (W3)", "ARA");
		airlineCodeMap.put("Arkia Israeli Airlines  (IZ)", "AIZ");
		airlineCodeMap.put("Asiana (OZ)", "AAR");
		airlineCodeMap.put("Atlas Air (5Y)", "GTI");
		airlineCodeMap.put("AtlasGlobal (KK)", "KKK");
		airlineCodeMap.put("Austral (AU)", "AUT");
		airlineCodeMap.put("Austrian (OS)", "AUA");
		airlineCodeMap.put("AVIANCA (AV)", "AVA");
		airlineCodeMap.put("Avianca Brasil (O6)", "ONE");
		airlineCodeMap.put("Azerbaijan Airlines (J2)", "AHY");
		airlineCodeMap.put("Azul Brazilian Airlines (AD)", "AZU");
		airlineCodeMap.put("Bahamasair (UP)", "BHS");
		airlineCodeMap.put("Bangkok Air  (PG)", "BKP");
		airlineCodeMap.put("Belavia - Belarusian Airlines (B2)", "BRU");
		airlineCodeMap.put("BH AIR (8H)", "BGH");
		airlineCodeMap.put("Biman (BG)", "BBC");
		airlineCodeMap.put("Binter Canarias (NT)", "IBB");
		airlineCodeMap.put("Blue Air (0B)", "BMS");
		airlineCodeMap.put("Blue Panorama (BV)", "BPA");
		airlineCodeMap.put("bmi Regional (BM)", "BMR");
		airlineCodeMap.put("Boliviana de Aviación - BoA (OB)", "BOV");
		airlineCodeMap.put("Braathens Regional Aviation AB (TF)", "SCW");
		airlineCodeMap.put("British Airways (BA)", "BAW");
		airlineCodeMap.put("Brussels Airlines (SN)", "BEL");
		airlineCodeMap.put("Bulgaria air (FB)", "LZB");
		airlineCodeMap.put("C.A.L. Cargo Airlines (5C)", "ICL");
		airlineCodeMap.put("Capital Airlines (JD)", "CBJ");
		airlineCodeMap.put("Cargojet Airways  (W8)", "CJT");
		airlineCodeMap.put("Cargolux S.A. (CV)", "CLX");
		airlineCodeMap.put("Caribbean Airlines (BW)", "BWA");
		airlineCodeMap.put("Carpatair (V3)", "KRP");
		airlineCodeMap.put("Cathay Dragon (KA)", "HDA");
		airlineCodeMap.put("Cathay Pacific (CX)", "CPA");
		airlineCodeMap.put("China Airlines (CI)", "CAL");
		airlineCodeMap.put("China Eastern (MU)", "CES");
		airlineCodeMap.put("China Postal Airlines (CF)", "CYZ");
		airlineCodeMap.put("China Southern Airlines (CZ)", "CSN");
		airlineCodeMap.put("CityJet (WX)", "BCY");
		airlineCodeMap.put("Comair (MN)", "CAW");
		airlineCodeMap.put("Condor (DE)", "CFG");
		airlineCodeMap.put("COPA Airlines (CM)", "CMP");
		airlineCodeMap.put("Corendon Airlines (XC)", "CAI");
		airlineCodeMap.put("Corsair International (SS)", "CRL");
		airlineCodeMap.put("Croatia Airlines (OU)", "CTN");
		airlineCodeMap.put("Cubana (CU)", "CUB");
		airlineCodeMap.put("Czech Airlines j.s.c (OK)", "CSA");
		airlineCodeMap.put("Delta Air Lines (DL)", "DAL");
		airlineCodeMap.put("DHL Air  (D0)", "DHK");
		airlineCodeMap.put("DHL Aviation EEMEA B.S.C.(c)  (ES)", "DHX");
		airlineCodeMap.put("Dniproavia (Z6)", "UDN");
		airlineCodeMap.put("Egyptair (MS)", "MSR");
		airlineCodeMap.put("EL AL (LY)", "ELY");
		airlineCodeMap.put("Emirates (EK)", "UAE");
		airlineCodeMap.put("Ethiopian Airlines (ET)", "ETH");
		airlineCodeMap.put("Etihad Airways (EY)", "ETD");
		airlineCodeMap.put("Euroatlantic Airways (YU)", "MMZ");
		airlineCodeMap.put("European Air Transport (QY)", "BCS");
		airlineCodeMap.put("Eurowings (EW)", "EWG");
		airlineCodeMap.put("EVA Air (BR)", "EVA");
		airlineCodeMap.put("Federal Express (FX)", "FDX");
		airlineCodeMap.put("Fiji Airways (FJ)", "FJI");
		airlineCodeMap.put("Finnair (AY)", "FIN");
		airlineCodeMap.put("flybe (BE)", "BEE");
		airlineCodeMap.put("flydubai (FZ)", "FDB");
		airlineCodeMap.put("FlyEgypt (FT)", "FEG");
		airlineCodeMap.put("Freebird Airlines (FH)", "FHY");
		airlineCodeMap.put("Garuda (GA)", "GIA");
		airlineCodeMap.put("Georgian Airways (A9)", "TGZ");
		airlineCodeMap.put("Germania (ST)", "GMI");
		airlineCodeMap.put("Gulf Air (GF)", "GFA");
		airlineCodeMap.put("Hahn Air (HR)", "HHN");
		airlineCodeMap.put("Hainan Airlines (HU)", "CHH");
		airlineCodeMap.put("Hawaiian Airlines (HA)", "HAL");
		airlineCodeMap.put("Hi Fly (5K)", "HFY");
		airlineCodeMap.put("Hong Kong Airlines (HX)", "CRK");
		airlineCodeMap.put("Hong Kong Express Airways  (UO)", "HKE");
		airlineCodeMap.put("IBERIA (IB)", "IBE");
		airlineCodeMap.put("Icelandair (FI)", "ICE");
		airlineCodeMap.put("InselAir (7i)", "INC");
		airlineCodeMap.put("Interjet (4O)", "AIJ");
		airlineCodeMap.put("Iran Air (IR)", "IRA");
		airlineCodeMap.put("Iran Aseman Airlines (EP)", "IRC");
		airlineCodeMap.put("Israir (6H)", "ISR");
		airlineCodeMap.put("Japan Airlines (JL)", "JAL");
		airlineCodeMap.put("Jazeera Airways  (J9)", "JZR");
		airlineCodeMap.put("Jet Airways (9W)", "JAI");
		airlineCodeMap.put("JetBlue (B6)", "JBU");
		airlineCodeMap.put("Jordan Aviation (R5)", "JAV");
		airlineCodeMap.put("JSC Nordavia-RA (5N)", "AUL");
		airlineCodeMap.put("Juneyao Airlines (HO)", "DKH");
		airlineCodeMap.put("Kenya Airways (KQ)", "KQA");
		airlineCodeMap.put("Kish Air (Y9)", "IRK");
		airlineCodeMap.put("KLM (KL)", "KLM");
		airlineCodeMap.put("Korean Air (KE)", "KAL");
		airlineCodeMap.put("Kuwait Airways (KU)", "KAC");
		airlineCodeMap.put("LACSA (LR)", "LRC");
		airlineCodeMap.put("LAM (TM)", "LAM");
		airlineCodeMap.put("Lao Airlines (QV)", "LAO");
		airlineCodeMap.put("LATAM Airlines Argentina (4M)", "DSM");
		airlineCodeMap.put("LATAM Airlines Brasil (JJ)", "TAM");
		airlineCodeMap.put("LATAM Airlines Colombia (4C)", "ARE");
		airlineCodeMap.put("LATAM Airlines Ecuador (XL)", "LNE");
		airlineCodeMap.put("LATAM Airlines Group (LA)", "LAN");
		airlineCodeMap.put("LATAM Airlines Paraguay (PZ)", "LAP");
		airlineCodeMap.put("LATAM Airlines Peru (LP)", "LPE");
		airlineCodeMap.put("LATAM Cargo Brasil (M3)", "TUS");
		airlineCodeMap.put("LATAM Cargo Chile (UC)", "LCO");
		airlineCodeMap.put("LATAM Cargo Mexico (M7)", "MAA");
		airlineCodeMap.put("LIAT Airlines (LI)", "LIA");
		airlineCodeMap.put("LLC NORD WIND (N4)", "NWS");
		airlineCodeMap.put("Loong Air (GJ)", "CDC");
		airlineCodeMap.put("LOT Polish Airlines (LO)", "LOT");
		airlineCodeMap.put("Lucky Air (8L)", "LKE");
		airlineCodeMap.put("Lufthansa (LH)", "DLH");
		airlineCodeMap.put("Lufthansa Cargo (LH)", "GEC");
		airlineCodeMap.put("Lufthansa CityLine (CL)", "CLH");
		airlineCodeMap.put("Luxair (LG)", "LGL");
		airlineCodeMap.put("Mahan Air (W5)", "IRM");
		airlineCodeMap.put("Malaysia Airlines (MH)", "MAS");
		airlineCodeMap.put("Mandarin Airlines (AE)", "MDA");
		airlineCodeMap.put("Martinair Cargo (MP)", "MPH");
		airlineCodeMap.put("Mauritania Airlines International (L6)", "MAI");
		airlineCodeMap.put("MEA (ME)", "MEA");
		airlineCodeMap.put("Meridiana fly (IG)", "ISS");
		airlineCodeMap.put("MIAT (OM)", "MGL");
		airlineCodeMap.put("Mistral Air (M4)", "MSA");
		airlineCodeMap.put("Montenegro Airlines (YM)", "MGX");
		airlineCodeMap.put("Myanmar Airways International (8M)", "MMA");
		airlineCodeMap.put("Nesma Airlines (NE)", "NMA");
		airlineCodeMap.put("Nextjet (2N)", "NTJ");
		airlineCodeMap.put("Nile Air (NP)", "NIA");
		airlineCodeMap.put("Nippon Cargo Airlines (NCA) (KZ)", "NCA");
		airlineCodeMap.put("Nouvelair (BJ)", "LBT");
		airlineCodeMap.put("Okay Airways (BK)", "OKA");
		airlineCodeMap.put("Olympic Air (OA)", "OAL");
		airlineCodeMap.put("Oman Air (WY)", "OAS");
		airlineCodeMap.put("Onur Air (8Q)", "OHY");
		airlineCodeMap.put("Overland Airways (OF)", "OLA");
		airlineCodeMap.put("Pegasus Airlines (PC)", "PGT");
		airlineCodeMap.put("PGA-Portugália Airlines (NI)", "PGA");
		airlineCodeMap.put("Philippine Airlines (PR)", "PAL");
		airlineCodeMap.put("PIA (PK)", "PIA");
		airlineCodeMap.put("Precision Air (PW)", "PRF");
		airlineCodeMap.put("PrivatAir (PV)", "PTI");
		airlineCodeMap.put("Qantas (QF)", "QFA");
		airlineCodeMap.put("Qatar Airways (QR)", "QTR");
		airlineCodeMap.put("Rossiya Airlines  (FV)", "SDM");
		airlineCodeMap.put("Royal Air Maroc (AT)", "RAM");
		airlineCodeMap.put("Royal Brunei (BI)", "RBA");
		airlineCodeMap.put("Royal Jordanian (RJ)", "RJA");
		airlineCodeMap.put("RwandAir (WB)", "RWD");
		airlineCodeMap.put("S7 Airlines (S7)", "SBI");
		airlineCodeMap.put("SAA (SA)", "SAA");
		airlineCodeMap.put("Safair (FA)", "SFR");
		airlineCodeMap.put("Safi Airways (4Q)", "SFW");
		airlineCodeMap.put("Santa Barbara (S3)", "BBR");
		airlineCodeMap.put("SAS (SK)", "SAS");
		airlineCodeMap.put("SATA Air Açores (SP)", "SAT");
		airlineCodeMap.put("SATA Internacional (S4)", "RZO");
		airlineCodeMap.put("Saudi Arabian Airlines (SV)", "SVA");
		airlineCodeMap.put("Shandong Airlines  (SC)", "CDG");
		airlineCodeMap.put("Shenzhen Airlines  (ZH)", "CSZ");
		airlineCodeMap.put("SIA (SQ)", "SIA");
		airlineCodeMap.put("SIA Cargo (SQ)", "SIA");
		airlineCodeMap.put("Silk Way West Airlines (7L)", "AZG");
		airlineCodeMap.put("Silkair (MI)", "SLK");
		airlineCodeMap.put("SKY Airline (H2)", "SKU");
		airlineCodeMap.put("South African Express Airways (XZ)", "EXY");
		airlineCodeMap.put("SriLankan (UL)", "ALK");
		airlineCodeMap.put("SunExpress (XQ)", "SXS");
		airlineCodeMap.put("Surinam Airways (PY)", "SLM");
		airlineCodeMap.put("SWISS (LX)", "SWR");
		airlineCodeMap.put("Syrianair (RB)", "SYR");
		airlineCodeMap.put("TAAG - Angola Airlines (DT)", "DTA");
		airlineCodeMap.put("TACA (TA)", "TAI");
		airlineCodeMap.put("TACA Peru (T0)", "TPU");
		airlineCodeMap.put("TACV Cabo Verde Airlines (VR)", "TCV");
		airlineCodeMap.put("TAME - Linea Aérea del Ecuador (EQ)", "TAE");
		airlineCodeMap.put("TAP Portugal (TP)", "TAP");
		airlineCodeMap.put("TAROM  (RO)", "ROT");
		airlineCodeMap.put("Thai Airways International (TG)", "THA");
		airlineCodeMap.put("Thai Lion Air (SL)", "TLM");
		airlineCodeMap.put("THY - Turkish Airlines (TK)", "THY");
		airlineCodeMap.put("Tianjin Airlines (GS)", "GCR");
		airlineCodeMap.put("TNT Airways S.A. (3V)", "TAY");
		airlineCodeMap.put("TransAsia Airways (GE)", "TNA");
		airlineCodeMap.put("TUIfly (X3)", "TUI");
		airlineCodeMap.put("Tunisair (TU)", "TAR");
		airlineCodeMap.put("Ukraine International Airlines (PS)", "AUI");
		airlineCodeMap.put("United Airlines (UA)", "UAL");
		airlineCodeMap.put("UPS Airlines (5X)", "UPS");
		airlineCodeMap.put("Ural Airlines (U6)", "SVR");
		airlineCodeMap.put("UTair (UT)", "UTA");
		airlineCodeMap.put("Uzbekistan Airways (HY)", "UZB");
		airlineCodeMap.put("Vietjet (VJ)", "VJC");
		airlineCodeMap.put("Vietnam Airlines (VN)", "HVN");
		airlineCodeMap.put("Virgin Atlantic (VS)", "VIR");
		airlineCodeMap.put("Virgin Australia (VA)", "VAU");
		airlineCodeMap.put("Volaris (Y4)", "VOI");
		airlineCodeMap.put("Volga-Dnepr Airlines (VI)", "VDA");
		airlineCodeMap.put("VRG Linhas Aéreas S.A. - Grupo GOL (G3)", "GLO");
		airlineCodeMap.put("Vueling (VY)", "VLG");
		airlineCodeMap.put("Wamos Air (EB)", "PLM");
		airlineCodeMap.put("WestJet (WS)", "WJA");
		airlineCodeMap.put("White coloured by you (WI)", "WHT");
		airlineCodeMap.put("Wideroe (WF)", "WIF");
		airlineCodeMap.put("Xiamen Airlines (MF)", "CXA");
		airlineCodeMap.put("Yemenia (IY)", "IYE");


		
		
		
		
	}

	public static ContextAwareHttpComponentsClientHttpRequestFactory getHttpContext(){
		CloseableHttpClient httpclient = HttpClients.createDefault();
		ContextAwareHttpComponentsClientHttpRequestFactory customFactory = new ContextAwareHttpComponentsClientHttpRequestFactory(httpclient);
		HttpHost targetHost = new HttpHost(SAConstant.localhost, SAConstant.localport, "http");
		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		credsProvider.setCredentials(
		        new AuthScope(targetHost.getHostName(), targetHost.getPort()),
		        new UsernamePasswordCredentials(SAConstant.uname, SAConstant.pword));

		// Create AuthCache instance
		AuthCache authCache = new BasicAuthCache();
		// Generate BASIC scheme object and add it to the local auth cache
		BasicScheme basicAuth = new BasicScheme();
		authCache.put(targetHost, basicAuth);

		// Add AuthCache to the execution context
		HttpClientContext context = HttpClientContext.create();
		context.setCredentialsProvider(credsProvider);
		context.setAuthCache(authCache);
		System.out.println(context);
		customFactory.setHttpContext(context);
		return customFactory;
	}
}
