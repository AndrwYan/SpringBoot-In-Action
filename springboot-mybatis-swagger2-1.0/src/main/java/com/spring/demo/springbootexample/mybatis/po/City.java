package com.spring.demo.springbootexample.mybatis.po;

public class City {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.id
     *
     * @mbggenerated Sun Feb 14 13:39:03 CST 2021
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.province_id
     *
     * @mbggenerated Sun Feb 14 13:39:03 CST 2021
     */
    private Integer provinceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.city_name
     *
     * @mbggenerated Sun Feb 14 13:39:03 CST 2021
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.description
     *
     * @mbggenerated Sun Feb 14 13:39:03 CST 2021
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.id
     *
     * @return the value of city.id
     *
     * @mbggenerated Sun Feb 14 13:39:03 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.id
     *
     * @param id the value for city.id
     *
     * @mbggenerated Sun Feb 14 13:39:03 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.province_id
     *
     * @return the value of city.province_id
     *
     * @mbggenerated Sun Feb 14 13:39:03 CST 2021
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.province_id
     *
     * @param provinceId the value for city.province_id
     *
     * @mbggenerated Sun Feb 14 13:39:03 CST 2021
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.city_name
     *
     * @return the value of city.city_name
     *
     * @mbggenerated Sun Feb 14 13:39:03 CST 2021
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.city_name
     *
     * @param cityName the value for city.city_name
     *
     * @mbggenerated Sun Feb 14 13:39:03 CST 2021
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.description
     *
     * @return the value of city.description
     *
     * @mbggenerated Sun Feb 14 13:39:03 CST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.description
     *
     * @param description the value for city.description
     *
     * @mbggenerated Sun Feb 14 13:39:03 CST 2021
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}