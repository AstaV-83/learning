package astvzv.lt.learning;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "user")
public class XmlUser {

    @JacksonXmlProperty(isAttribute = true, localName = "id")
    private int id;

    @JacksonXmlProperty(isAttribute = true, localName = "name")
    private String name;

    @JacksonXmlProperty(isAttribute = true, localName = "termsofuse")
    private String termsOfUse;

    @JacksonXmlProperty(localName = "firstname")
    private ValueElement firstname;

    @JacksonXmlProperty(localName = "lastname")
    private ValueElement lastname;

    @JacksonXmlProperty(localName = "avatarlink")
    private ValueElement avatarlink;

    @JacksonXmlProperty(localName = "yearregistered")
    private ValueElement yearregistered;

    @JacksonXmlProperty(localName = "lastlogin")
    private ValueElement lastlogin;

    @JacksonXmlProperty(localName = "stateorprovince")
    private ValueElement stateorprovince;

    @JacksonXmlProperty(localName = "country")
    private ValueElement country;

    @JacksonXmlProperty(localName = "webaddress")
    private ValueElement webaddress;

    @JacksonXmlProperty(localName = "xboxaccount")
    private ValueElement xboxaccount;

    @JacksonXmlProperty(localName = "wiiaccount")
    private ValueElement wiiaccount;

    @JacksonXmlProperty(localName = "psnaccount")
    private ValueElement psnaccount;

    @JacksonXmlProperty(localName = "battlenetaccount")
    private ValueElement battlenetaccount;

    @JacksonXmlProperty(localName = "steamaccount")
    private ValueElement steamaccount;

    @JacksonXmlProperty(localName = "traderating")
    private ValueElement traderating;

    // --------- getters & setters ----------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTermsOfUse() {
        return termsOfUse;
    }

    public void setTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    public ValueElement getFirstname() {
        return firstname;
    }

    public void setFirstname(ValueElement firstname) {
        this.firstname = firstname;
    }

    public ValueElement getLastname() {
        return lastname;
    }

    public void setLastname(ValueElement lastname) {
        this.lastname = lastname;
    }

    public ValueElement getAvatarlink() {
        return avatarlink;
    }

    public void setAvatarlink(ValueElement avatarlink) {
        this.avatarlink = avatarlink;
    }

    public ValueElement getYearregistered() {
        return yearregistered;
    }

    public void setYearregistered(ValueElement yearregistered) {
        this.yearregistered = yearregistered;
    }

    public ValueElement getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(ValueElement lastlogin) {
        this.lastlogin = lastlogin;
    }

    public ValueElement getStateorprovince() {
        return stateorprovince;
    }

    public void setStateorprovince(ValueElement stateorprovince) {
        this.stateorprovince = stateorprovince;
    }

    public ValueElement getCountry() {
        return country;
    }

    public void setCountry(ValueElement country) {
        this.country = country;
    }

    public ValueElement getWebaddress() {
        return webaddress;
    }

    public void setWebaddress(ValueElement webaddress) {
        this.webaddress = webaddress;
    }

    public ValueElement getXboxaccount() {
        return xboxaccount;
    }

    public void setXboxaccount(ValueElement xboxaccount) {
        this.xboxaccount = xboxaccount;
    }

    public ValueElement getWiiaccount() {
        return wiiaccount;
    }

    public void setWiiaccount(ValueElement wiiaccount) {
        this.wiiaccount = wiiaccount;
    }

    public ValueElement getPsnaccount() {
        return psnaccount;
    }

    public void setPsnaccount(ValueElement psnaccount) {
        this.psnaccount = psnaccount;
    }

    public ValueElement getBattlenetaccount() {
        return battlenetaccount;
    }

    public void setBattlenetaccount(ValueElement battlenetaccount) {
        this.battlenetaccount = battlenetaccount;
    }

    public ValueElement getSteamaccount() {
        return steamaccount;
    }

    public void setSteamaccount(ValueElement steamaccount) {
        this.steamaccount = steamaccount;
    }

    public ValueElement getTraderating() {
        return traderating;
    }

    public void setTraderating(ValueElement traderating) {
        this.traderating = traderating;
    }

    public static class ValueElement {
        @JacksonXmlProperty(isAttribute = true, localName = "value")
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
