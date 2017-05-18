package com.sfxie.extension.mybatis.exception;

/**
 * 分区字段为空异常
 * @author xieshengfeng
 * @email  xsfcy@126.com
 * @since  2015年5月16日 下午9:01:58
 * @todo   
 *
 */
public class TableNameGeneratedException extends ExtensionMybatisException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TableNameGeneratedException(Exception e){
		super("partitionEmptyException",e);
	}

	public TableNameGeneratedException(String errorCode,Throwable t){
		super(errorCode,t);
	}

}
