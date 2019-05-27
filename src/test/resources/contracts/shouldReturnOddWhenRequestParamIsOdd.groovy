package contracts
import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return odd when the number input is odd"
    request {
        method GET()
        url("/validate/prime-number") {
            queryParameters {
                parameter("number", "3")
            }
        }
    }

    response {
        body("{\"results\": \"Odd\"}")
        status 200
    }
}
