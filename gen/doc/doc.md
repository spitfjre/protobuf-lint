# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [io/swagger/petstore/v2/category.proto](#io/swagger/petstore/v2/category.proto)
    - [Category](#io.swagger.petstore.v2.Category)
  
- [io/swagger/petstore/v2/order.proto](#io/swagger/petstore/v2/order.proto)
    - [Order](#io.swagger.petstore.v2.Order)
  
    - [Order.Status](#io.swagger.petstore.v2.Order.Status)
  
- [io/swagger/petstore/v2/tag.proto](#io/swagger/petstore/v2/tag.proto)
    - [Tag](#io.swagger.petstore.v2.Tag)
  
- [io/swagger/petstore/v2/pet.proto](#io/swagger/petstore/v2/pet.proto)
    - [Pet](#io.swagger.petstore.v2.Pet)
  
    - [Pet.Status](#io.swagger.petstore.v2.Pet.Status)
  
- [io/swagger/petstore/v2/pet_service.proto](#io/swagger/petstore/v2/pet_service.proto)
    - [AddPetRequest](#io.swagger.petstore.v2.AddPetRequest)
    - [DeletePetRequest](#io.swagger.petstore.v2.DeletePetRequest)
    - [FindPetRequest](#io.swagger.petstore.v2.FindPetRequest)
    - [FindPetResponse](#io.swagger.petstore.v2.FindPetResponse)
    - [FindPetsByStatusRequest](#io.swagger.petstore.v2.FindPetsByStatusRequest)
    - [FindPetsByStatusResponse](#io.swagger.petstore.v2.FindPetsByStatusResponse)
    - [FindPetsByTagsRequest](#io.swagger.petstore.v2.FindPetsByTagsRequest)
    - [FindPetsByTagsResponse](#io.swagger.petstore.v2.FindPetsByTagsResponse)
    - [UpdatePetRequest](#io.swagger.petstore.v2.UpdatePetRequest)
    - [UpdatePetWithFormDataRequest](#io.swagger.petstore.v2.UpdatePetWithFormDataRequest)
    - [UploadImageRequest](#io.swagger.petstore.v2.UploadImageRequest)
    - [UploadImageResponse](#io.swagger.petstore.v2.UploadImageResponse)
  
    - [PetService](#io.swagger.petstore.v2.PetService)
  
- [io/swagger/petstore/v2/store_service.proto](#io/swagger/petstore/v2/store_service.proto)
    - [CreateOrderRequest](#io.swagger.petstore.v2.CreateOrderRequest)
    - [CreateOrderResponse](#io.swagger.petstore.v2.CreateOrderResponse)
    - [DeleteOrderRequest](#io.swagger.petstore.v2.DeleteOrderRequest)
    - [GetInventoryResponse](#io.swagger.petstore.v2.GetInventoryResponse)
    - [GetInventoryResponse.InventoryByStatusEntry](#io.swagger.petstore.v2.GetInventoryResponse.InventoryByStatusEntry)
    - [GetOrderRequest](#io.swagger.petstore.v2.GetOrderRequest)
    - [GetOrderResponse](#io.swagger.petstore.v2.GetOrderResponse)
  
    - [StoreService](#io.swagger.petstore.v2.StoreService)
  
- [io/swagger/petstore/v2/user.proto](#io/swagger/petstore/v2/user.proto)
    - [User](#io.swagger.petstore.v2.User)
  
- [io/swagger/petstore/v2/user_service.proto](#io/swagger/petstore/v2/user_service.proto)
    - [CreateUserRequest](#io.swagger.petstore.v2.CreateUserRequest)
    - [CreateUsersRequest](#io.swagger.petstore.v2.CreateUsersRequest)
    - [DeleteUserRequest](#io.swagger.petstore.v2.DeleteUserRequest)
    - [GetUserRequest](#io.swagger.petstore.v2.GetUserRequest)
    - [GetUserResponse](#io.swagger.petstore.v2.GetUserResponse)
    - [LoginUserRequest](#io.swagger.petstore.v2.LoginUserRequest)
    - [LoginUserResponse](#io.swagger.petstore.v2.LoginUserResponse)
    - [UpdateUserRequest](#io.swagger.petstore.v2.UpdateUserRequest)
  
    - [UserService](#io.swagger.petstore.v2.UserService)
  
- [Scalar Value Types](#scalar-value-types)



<a name="io/swagger/petstore/v2/category.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## io/swagger/petstore/v2/category.proto



<a name="io.swagger.petstore.v2.Category"></a>

### Category



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |





 

 

 

 



<a name="io/swagger/petstore/v2/order.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## io/swagger/petstore/v2/order.proto



<a name="io.swagger.petstore.v2.Order"></a>

### Order



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| pet_id | [int64](#int64) |  |  |
| quantity | [int32](#int32) |  |  |
| ship_date | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| status | [Order.Status](#io.swagger.petstore.v2.Order.Status) |  |  |
| complete | [bool](#bool) |  |  |





 


<a name="io.swagger.petstore.v2.Order.Status"></a>

### Order.Status


| Name | Number | Description |
| ---- | ------ | ----------- |
| STATUS_UNSPECIFIED | 0 |  |
| STATUS_PLACED | 1 |  |
| STATUS_APPROVED | 2 |  |
| STATUS_DELIVERED | 3 |  |


 

 

 



<a name="io/swagger/petstore/v2/tag.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## io/swagger/petstore/v2/tag.proto



<a name="io.swagger.petstore.v2.Tag"></a>

### Tag



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| string | [string](#string) |  |  |





 

 

 

 



<a name="io/swagger/petstore/v2/pet.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## io/swagger/petstore/v2/pet.proto



<a name="io.swagger.petstore.v2.Pet"></a>

### Pet



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| category | [Category](#io.swagger.petstore.v2.Category) |  |  |
| name | [string](#string) |  |  |
| photo_urls | [string](#string) | repeated |  |
| tags | [Tag](#io.swagger.petstore.v2.Tag) | repeated |  |
| status | [Pet.Status](#io.swagger.petstore.v2.Pet.Status) |  |  |





 


<a name="io.swagger.petstore.v2.Pet.Status"></a>

### Pet.Status


| Name | Number | Description |
| ---- | ------ | ----------- |
| STATUS_UNSPECIFIED | 0 |  |
| STATUS_AVAILABLE | 1 |  |
| STATUS_PENDING | 2 |  |
| STATUS_SOLD | 3 |  |


 

 

 



<a name="io/swagger/petstore/v2/pet_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## io/swagger/petstore/v2/pet_service.proto



<a name="io.swagger.petstore.v2.AddPetRequest"></a>

### AddPetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pet | [Pet](#io.swagger.petstore.v2.Pet) |  |  |






<a name="io.swagger.petstore.v2.DeletePetRequest"></a>

### DeletePetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pet_id | [int64](#int64) |  |  |






<a name="io.swagger.petstore.v2.FindPetRequest"></a>

### FindPetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pet_id | [int64](#int64) |  |  |






<a name="io.swagger.petstore.v2.FindPetResponse"></a>

### FindPetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pet | [Pet](#io.swagger.petstore.v2.Pet) |  |  |






<a name="io.swagger.petstore.v2.FindPetsByStatusRequest"></a>

### FindPetsByStatusRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| statuses | [Pet.Status](#io.swagger.petstore.v2.Pet.Status) | repeated |  |






<a name="io.swagger.petstore.v2.FindPetsByStatusResponse"></a>

### FindPetsByStatusResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pets | [Pet](#io.swagger.petstore.v2.Pet) | repeated |  |






<a name="io.swagger.petstore.v2.FindPetsByTagsRequest"></a>

### FindPetsByTagsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tags | [string](#string) | repeated |  |






<a name="io.swagger.petstore.v2.FindPetsByTagsResponse"></a>

### FindPetsByTagsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pets | [Pet](#io.swagger.petstore.v2.Pet) | repeated |  |






<a name="io.swagger.petstore.v2.UpdatePetRequest"></a>

### UpdatePetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pet | [Pet](#io.swagger.petstore.v2.Pet) |  |  |






<a name="io.swagger.petstore.v2.UpdatePetWithFormDataRequest"></a>

### UpdatePetWithFormDataRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pet_id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| status | [Pet.Status](#io.swagger.petstore.v2.Pet.Status) |  |  |






<a name="io.swagger.petstore.v2.UploadImageRequest"></a>

### UploadImageRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pet_id | [int64](#int64) |  |  |
| additional_metadata | [string](#string) |  |  |
| file | [bytes](#bytes) |  |  |






<a name="io.swagger.petstore.v2.UploadImageResponse"></a>

### UploadImageResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| code | [int32](#int32) |  |  |
| type | [string](#string) |  |  |
| message | [string](#string) |  |  |





 

 

 


<a name="io.swagger.petstore.v2.PetService"></a>

### PetService
Everything about your pets

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| UploadImage | [UploadImageRequest](#io.swagger.petstore.v2.UploadImageRequest) | [UploadImageResponse](#io.swagger.petstore.v2.UploadImageResponse) | Uploads an image |
| AddPet | [AddPetRequest](#io.swagger.petstore.v2.AddPetRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) | Add a new pet to the store |
| UpdatePet | [UpdatePetRequest](#io.swagger.petstore.v2.UpdatePetRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) | Update an existing pet |
| FindPetsByStatus | [FindPetsByStatusRequest](#io.swagger.petstore.v2.FindPetsByStatusRequest) | [FindPetsByStatusResponse](#io.swagger.petstore.v2.FindPetsByStatusResponse) | Finds pets by status |
| FindPetsByTags | [FindPetsByTagsRequest](#io.swagger.petstore.v2.FindPetsByTagsRequest) | [FindPetsByTagsResponse](#io.swagger.petstore.v2.FindPetsByTagsResponse) | Finds pets by tags |
| FindPet | [FindPetRequest](#io.swagger.petstore.v2.FindPetRequest) | [FindPetResponse](#io.swagger.petstore.v2.FindPetResponse) | Find pet by id |
| UpdatePetWithFormData | [UpdatePetWithFormDataRequest](#io.swagger.petstore.v2.UpdatePetWithFormDataRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) | Updates a pet in the store with form data |
| DeletePet | [DeletePetRequest](#io.swagger.petstore.v2.DeletePetRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) | Deletes a pet |

 



<a name="io/swagger/petstore/v2/store_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## io/swagger/petstore/v2/store_service.proto



<a name="io.swagger.petstore.v2.CreateOrderRequest"></a>

### CreateOrderRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| order | [Order](#io.swagger.petstore.v2.Order) |  |  |






<a name="io.swagger.petstore.v2.CreateOrderResponse"></a>

### CreateOrderResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| order | [Order](#io.swagger.petstore.v2.Order) |  |  |






<a name="io.swagger.petstore.v2.DeleteOrderRequest"></a>

### DeleteOrderRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| order_id | [int64](#int64) |  |  |






<a name="io.swagger.petstore.v2.GetInventoryResponse"></a>

### GetInventoryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| inventory_by_status | [GetInventoryResponse.InventoryByStatusEntry](#io.swagger.petstore.v2.GetInventoryResponse.InventoryByStatusEntry) | repeated |  |






<a name="io.swagger.petstore.v2.GetInventoryResponse.InventoryByStatusEntry"></a>

### GetInventoryResponse.InventoryByStatusEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [int32](#int32) |  |  |






<a name="io.swagger.petstore.v2.GetOrderRequest"></a>

### GetOrderRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| order_id | [int64](#int64) |  |  |






<a name="io.swagger.petstore.v2.GetOrderResponse"></a>

### GetOrderResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| order | [Order](#io.swagger.petstore.v2.Order) |  |  |





 

 

 


<a name="io.swagger.petstore.v2.StoreService"></a>

### StoreService
Access to petstore orders

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetInventory | [.google.protobuf.Empty](#google.protobuf.Empty) | [GetInventoryResponse](#io.swagger.petstore.v2.GetInventoryResponse) | Returns pet inventories by status |
| CreateOrder | [CreateOrderRequest](#io.swagger.petstore.v2.CreateOrderRequest) | [CreateOrderResponse](#io.swagger.petstore.v2.CreateOrderResponse) | Place an order for a pet |
| GetOrder | [GetOrderRequest](#io.swagger.petstore.v2.GetOrderRequest) | [GetOrderResponse](#io.swagger.petstore.v2.GetOrderResponse) | Find purchase order by id |
| DeleteOrder | [DeleteOrderRequest](#io.swagger.petstore.v2.DeleteOrderRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) | Delete purchase order by id |

 



<a name="io/swagger/petstore/v2/user.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## io/swagger/petstore/v2/user.proto



<a name="io.swagger.petstore.v2.User"></a>

### User



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| username | [string](#string) |  |  |
| first_name | [string](#string) |  |  |
| last_name | [string](#string) |  |  |
| email | [string](#string) |  |  |
| password | [string](#string) |  |  |
| phone | [string](#string) |  |  |
| user_status | [int32](#int32) |  |  |





 

 

 

 



<a name="io/swagger/petstore/v2/user_service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## io/swagger/petstore/v2/user_service.proto



<a name="io.swagger.petstore.v2.CreateUserRequest"></a>

### CreateUserRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user | [User](#io.swagger.petstore.v2.User) |  |  |






<a name="io.swagger.petstore.v2.CreateUsersRequest"></a>

### CreateUsersRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| users | [User](#io.swagger.petstore.v2.User) | repeated |  |






<a name="io.swagger.petstore.v2.DeleteUserRequest"></a>

### DeleteUserRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| username | [string](#string) |  |  |






<a name="io.swagger.petstore.v2.GetUserRequest"></a>

### GetUserRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| username | [string](#string) |  |  |






<a name="io.swagger.petstore.v2.GetUserResponse"></a>

### GetUserResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| user | [User](#io.swagger.petstore.v2.User) |  |  |






<a name="io.swagger.petstore.v2.LoginUserRequest"></a>

### LoginUserRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| username | [string](#string) |  |  |
| password | [string](#string) |  |  |






<a name="io.swagger.petstore.v2.LoginUserResponse"></a>

### LoginUserResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| token | [string](#string) |  |  |






<a name="io.swagger.petstore.v2.UpdateUserRequest"></a>

### UpdateUserRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| username | [string](#string) |  |  |
| user | [User](#io.swagger.petstore.v2.User) |  |  |





 

 

 


<a name="io.swagger.petstore.v2.UserService"></a>

### UserService
Operations about user

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateUsers | [CreateUsersRequest](#io.swagger.petstore.v2.CreateUsersRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) | Creates list of users with given input array |
| GetUser | [GetUserRequest](#io.swagger.petstore.v2.GetUserRequest) | [GetUserResponse](#io.swagger.petstore.v2.GetUserResponse) | Get user by user name |
| UpdateUser | [UpdateUserRequest](#io.swagger.petstore.v2.UpdateUserRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) | Updated user |
| DeleteUser | [DeleteUserRequest](#io.swagger.petstore.v2.DeleteUserRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) | Delete user |
| LoginUser | [LoginUserRequest](#io.swagger.petstore.v2.LoginUserRequest) | [LoginUserResponse](#io.swagger.petstore.v2.LoginUserResponse) | Logs user into the system |
| LogoutUser | [.google.protobuf.Empty](#google.protobuf.Empty) | [.google.protobuf.Empty](#google.protobuf.Empty) | Logs out current logged in user session |
| CreateUser | [CreateUserRequest](#io.swagger.petstore.v2.CreateUserRequest) | [.google.protobuf.Empty](#google.protobuf.Empty) | Create user |

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |

