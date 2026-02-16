package Com.self.SpringBoot.Service;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import Com.self.SpringBoot.dto.NetBankingInfo;

@Service
public class UserPaymentService {

	public List<String> getPaymentOptions(){
		
		System.out.println("In Sevrice Layer : Consumer Application : Getting Data from Producer Application");
		
		// call REST Service of Producer Application
		
		// http://localhost:8888/payment/api/payment/options  
		// call above REST Api service by  using GET
		
		// Use RESTempalte class to consume other REST API SERVICES
		// above is plain restservice we dont have requestbody,path vaiabler,Query var
		
		String url=	"http://localhost:8888/payment/api/payment/options";
		RestTemplate restTemplate=new RestTemplate();
	
		ResponseEntity<List> responseEntity=	restTemplate.getForEntity(url, List.class);
		
		List<String> paymentOptions=	responseEntity.getBody();
		
     return paymentOptions;
	}

	public String callNetBanking() {
		
		// we need url , Http method, requestBody :{"username:"String","password":"String","amountTobePaid":0 }
		
		// create POJo class for RequestBody payload
	
		// Request Object
		
		
		
		NetBankingInfo info =new NetBankingInfo();
		info.setUserName("KSK");
		info.setPassword("asdf");
		info.setAmountTobePaid(123.12);
		
		String url = "http://localhost:8888/payment/api/payment/netbanking";
		
		
		HttpEntity<NetBankingInfo> httpEntity=new HttpEntity<NetBankingInfo>(info);
		RestTemplate restTemplate=new RestTemplate();
		
	ResponseEntity<String> responseEntity=restTemplate.exchange(url, HttpMethod.POST,httpEntity,String.class);
		
         String responseBody=responseEntity.getBody();	
		 return responseBody;
	}
	
}
