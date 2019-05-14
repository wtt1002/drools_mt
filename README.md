# drools_mt

## 运行说明：
	（1）需要引入freemarker.jar 和 junit-4.7.jar（已经添加在/src/main/java，直接build path->add to build path）
	（2）在src/main/java/drools的MyTest中，直接运行每个测试用例，即可产生康复方案。
	（3）规则文件中在src/main/resources/rules中
		患者基本分类规则：demo.drl
		运动风险分类规则：RiskStratified.drl（普通冠心病患者）
				RiskStratifiedOld.drl（高龄冠心病患者）
				RiskStratifiedPci.drl（近期Pci冠心病患者）
		饮食方案规则：Food.drl
		运动方案规则：Plan.drl