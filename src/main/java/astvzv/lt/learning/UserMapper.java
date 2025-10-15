package astvzv.lt.learning;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "firstname.value", target = "firstname")
    @Mapping(source = "lastname.value", target = "lastname")
    @Mapping(source = "avatarlink.value", target = "avatarlink")
    @Mapping(source = "yearregistered.value", target = "yearregistered")
    @Mapping(source = "lastlogin.value", target = "lastlogin")
    @Mapping(source = "stateorprovince.value", target = "stateorprovince")
    @Mapping(source = "country.value", target = "country")
    @Mapping(source = "webaddress.value", target = "webaddress")
    @Mapping(source = "xboxaccount.value", target = "xboxaccount")
    @Mapping(source = "wiiaccount.value", target = "wiiaccount")
    @Mapping(source = "psnaccount.value", target = "psnaccount")
    @Mapping(source = "battlenetaccount.value", target = "battlenetaccount")
    @Mapping(source = "steamaccount.value", target = "steamaccount")
    @Mapping(source = "traderating.value", target = "traderating")
    User toUser(XmlUser xmlUser);
}
