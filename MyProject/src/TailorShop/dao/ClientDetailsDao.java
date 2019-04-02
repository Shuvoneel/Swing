package TailorShop.dao;

import TailorShop.pojo.ClientDetails;
import java.util.List;

public interface ClientDetailsDao {

    List<ClientDetails> getClientDetailsByMobile(int mobile);

    List<ClientDetails> getClientDetailsByEmail(String email);

    List<ClientDetails> getDetails();
}
