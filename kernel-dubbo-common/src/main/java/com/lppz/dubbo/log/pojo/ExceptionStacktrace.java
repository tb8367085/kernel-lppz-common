package com.lppz.dubbo.log.pojo;

public class ExceptionStacktrace {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_stacktrace.id
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_stacktrace.exception
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    private Integer exception;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_stacktrace.stackTrace
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    private String stacktrace;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_stacktrace.text1
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    private String text1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_stacktrace.text2
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    private String text2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_stacktrace.id
     *
     * @return the value of exception_stacktrace.id
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_stacktrace.id
     *
     * @param id the value for exception_stacktrace.id
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_stacktrace.exception
     *
     * @return the value of exception_stacktrace.exception
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    public Integer getException() {
        return exception;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_stacktrace.exception
     *
     * @param exception the value for exception_stacktrace.exception
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    public void setException(Integer exception) {
        this.exception = exception;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_stacktrace.stackTrace
     *
     * @return the value of exception_stacktrace.stackTrace
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    public String getStacktrace() {
        return stacktrace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_stacktrace.stackTrace
     *
     * @param stacktrace the value for exception_stacktrace.stackTrace
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    public void setStacktrace(String stacktrace) {
        this.stacktrace = stacktrace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_stacktrace.text1
     *
     * @return the value of exception_stacktrace.text1
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    public String getText1() {
        return text1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_stacktrace.text1
     *
     * @param text1 the value for exception_stacktrace.text1
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    public void setText1(String text1) {
        this.text1 = text1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_stacktrace.text2
     *
     * @return the value of exception_stacktrace.text2
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    public String getText2() {
        return text2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_stacktrace.text2
     *
     * @param text2 the value for exception_stacktrace.text2
     *
     * @mbggenerated Fri Jul 08 11:32:45 CST 2016
     */
    public void setText2(String text2) {
        this.text2 = text2;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExceptionStacktrace [id=");
		builder.append(id);
		builder.append(", exception=");
		builder.append(exception);
		builder.append(", stacktrace=");
		builder.append(stacktrace);
		builder.append(", text1=");
		builder.append(text1);
		builder.append(", text2=");
		builder.append(text2);
		builder.append("]");
		return builder.toString();
	}
    
}