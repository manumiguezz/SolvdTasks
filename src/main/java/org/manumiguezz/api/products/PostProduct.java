package org.manumiguezz.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(methodType = HttpMethodType.POST, url = "${base_url}/products/add")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PostProduct extends AbstractApiMethodV2 {

    public PostProduct() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}